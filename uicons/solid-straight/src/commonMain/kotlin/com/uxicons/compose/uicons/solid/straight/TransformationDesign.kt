package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationDesign: ImageVector? = null

val Icons.Ss.TransformationDesign: ImageVector
    get() = _TransformationDesign ?: UXIcon(name = "TransformationDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.79f, 24f)
                lineTo(7f, 24f)
                lineToRelative(0.03f, -2.23f)
                lineTo(12.21f, 0f)
                horizontalLineToRelative(11.79f)
                lineToRelative(-0.03f, 2.23f)
                lineToRelative(-5.18f, 21.77f)
                close()
                moveTo(5f, 22f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                lineTo(0f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 2f)
                horizontalLineToRelative(3f)
                lineTo(5f, 0f)
                lineTo(0f, 0f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                close()
                moveTo(2f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(2f, 13f)
                lineTo(0f, 13f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                close()
                moveTo(10.15f, 0f)
                horizontalLineToRelative(-3.15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.68f)
                lineToRelative(0.48f, -2f)
                close()
            }
        }.also { _TransformationDesign = it}
