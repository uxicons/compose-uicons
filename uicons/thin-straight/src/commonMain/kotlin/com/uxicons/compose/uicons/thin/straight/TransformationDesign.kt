package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationDesign: ImageVector? = null

val Icons.Ts.TransformationDesign: ImageVector
    get() = _TransformationDesign ?: UXIcon(name = "TransformationDesign") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.44f, 0f)
                lineToRelative(-5.42f, 22.89f)
                lineToRelative(-0.01f, 1.11f)
                horizontalLineToRelative(11.56f)
                lineTo(23.99f, 1.11f)
                lineToRelative(0.01f, -1.11f)
                horizontalLineToRelative(-11.56f)
                close()
                moveTo(17.77f, 23f)
                horizontalLineToRelative(-9.76f)
                lineTo(13.23f, 1f)
                horizontalLineToRelative(9.76f)
                lineToRelative(-5.21f, 22f)
                close()
                moveTo(1f, 23f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(0f, 0f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                lineTo(1f, 1f)
                verticalLineToRelative(4f)
                lineTo(0f, 5f)
                lineTo(0f, 0f)
                close()
                moveTo(1f, 11f)
                lineTo(0f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(1f, 17f)
                lineTo(0f, 17f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(10.03f, 1f)
                horizontalLineToRelative(-3.03f)
                lineTo(7f, 0f)
                horizontalLineToRelative(3.22f)
                lineToRelative(-0.19f, 1f)
                close()
            }
        }.also { _TransformationDesign = it}
