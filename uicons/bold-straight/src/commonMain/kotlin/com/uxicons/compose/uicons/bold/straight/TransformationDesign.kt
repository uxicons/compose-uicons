package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationDesign: ImageVector? = null

val Icons.Bs.TransformationDesign: ImageVector
    get() = _TransformationDesign ?: UXIcon(name = "TransformationDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.33f, 0f)
                lineToRelative(-5.28f, 21.14f)
                lineToRelative(-0.04f, 2.86f)
                horizontalLineToRelative(11.67f)
                lineTo(23.95f, 2.86f)
                lineToRelative(0.04f, -2.86f)
                horizontalLineToRelative(-11.67f)
                close()
                moveTo(16.33f, 21f)
                horizontalLineToRelative(-6.16f)
                lineTo(14.67f, 3f)
                horizontalLineToRelative(6.16f)
                lineToRelative(-4.5f, 18f)
                close()
                moveTo(3f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(0f, 5f)
                lineTo(0f, 0f)
                close()
                moveTo(3f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
                moveTo(3f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                close()
                moveTo(9.65f, 3f)
                horizontalLineToRelative(-2.65f)
                lineTo(7f, 0f)
                horizontalLineToRelative(3.22f)
                lineToRelative(-0.57f, 3f)
                close()
            }
        }.also { _TransformationDesign = it}
