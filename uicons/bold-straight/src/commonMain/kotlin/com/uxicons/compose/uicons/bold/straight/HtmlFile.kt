package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HtmlFile: ImageVector? = null

val Icons.Bs.HtmlFile: ImageVector
    get() = _HtmlFile ?: UXIcon(name = "HtmlFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.33f)
                lineToRelative(-5.62f, -5.67f)
                horizontalLineToRelative(-11.38f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-17f)
                close()
                moveTo(24f, 17.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(6.4f)
                close()
                moveTo(13.5f, 11f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(15.6f, 19f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(0.43f, -7f)
                curveToRelative(0.04f, -0.7f, 0.41f, -1f, 0.85f, -1f)
                curveToRelative(0.29f, 0f, 0.57f, 0.24f, 0.72f, 0.64f)
                lineToRelative(1.0f, 2.56f)
                lineToRelative(1.0f, -2.56f)
                curveToRelative(0.15f, -0.4f, 0.43f, -0.64f, 0.72f, -0.64f)
                curveToRelative(0.44f, 0f, 0.81f, 0.29f, 0.85f, 1f)
                lineToRelative(0.43f, 7f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-0.21f, -3.43f)
                lineToRelative(-1.18f, 3.04f)
                lineToRelative(-1.18f, -3.04f)
                close()
                moveTo(8.6f, 11f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-3.2f)
                horizontalLineToRelative(-1.4f)
                verticalLineToRelative(3.2f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(3.2f)
                horizontalLineToRelative(1.4f)
                verticalLineToRelative(-3.2f)
                close()
            }
        }.also { _HtmlFile = it}
