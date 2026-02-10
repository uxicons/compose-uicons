package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationDesign: ImageVector? = null

val Icons.Rs.TransformationDesign: ImageVector
    get() = _TransformationDesign ?: UXIcon(name = "TransformationDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.21f, 0f)
                lineToRelative(-5.18f, 21.77f)
                lineToRelative(-0.03f, 2.23f)
                horizontalLineToRelative(11.79f)
                lineTo(23.97f, 2.23f)
                lineToRelative(0.03f, -2.23f)
                horizontalLineToRelative(-11.79f)
                close()
                moveTo(17.21f, 22f)
                horizontalLineToRelative(-8.18f)
                lineTo(13.79f, 2f)
                horizontalLineToRelative(8.18f)
                lineToRelative(-4.76f, 20f)
                close()
                moveTo(2f, 22f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                close()
                moveTo(0f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                lineTo(0f, 5f)
                lineTo(0f, 0f)
                close()
                moveTo(2f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(2f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(9.84f, 2f)
                horizontalLineToRelative(-2.84f)
                lineTo(7f, 0f)
                horizontalLineToRelative(3.22f)
                lineToRelative(-0.38f, 2f)
                close()
            }
        }.also { _TransformationDesign = it}
