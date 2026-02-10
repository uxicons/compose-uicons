package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HtmlFile: ImageVector? = null

val Icons.Rs.HtmlFile: ImageVector
    get() = _HtmlFile ?: UXIcon(name = "HtmlFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 22f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-21f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9.41f)
                lineToRelative(7.59f, 7.59f)
                verticalLineToRelative(2.41f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                close()
                moveTo(24f, 18.4f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(6.4f)
                close()
                moveTo(13.5f, 12f)
                verticalLineToRelative(1.6f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(6.4f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-6.4f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-1.6f)
                close()
                moveTo(15.6f, 20f)
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
                moveTo(8.6f, 12f)
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
