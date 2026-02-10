package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalkieTalkie: ImageVector? = null

val Icons.Bs.WalkieTalkie: ImageVector
    get() = _WalkieTalkie ?: UXIcon(name = "WalkieTalkie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 3f)
                horizontalLineToRelative(-5.5f)
                lineTo(13f, 1f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(8f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3.04f)
                curveToRelative(-1.69f, 0.24f, -3f, 1.7f, -3f, 3.46f)
                verticalLineToRelative(5.95f)
                curveToRelative(0f, 1.02f, 0.35f, 2.02f, 0.99f, 2.81f)
                lineToRelative(1.01f, 1.27f)
                verticalLineToRelative(7.47f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-7.47f)
                lineToRelative(1.01f, -1.27f)
                curveToRelative(0.64f, -0.8f, 0.99f, -1.79f, 0.99f, -2.81f)
                verticalLineToRelative(-5.95f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19f, 12.45f)
                curveToRelative(0f, 0.34f, -0.12f, 0.67f, -0.33f, 0.94f)
                lineToRelative(-1.67f, 2.09f)
                verticalLineToRelative(5.53f)
                lineTo(7f, 21f)
                verticalLineToRelative(-5.53f)
                lineToRelative(-1.67f, -2.09f)
                curveToRelative(-0.21f, -0.27f, -0.33f, -0.6f, -0.33f, -0.94f)
                verticalLineToRelative(-5.95f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.95f)
                close()
                moveTo(7f, 8f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(4f)
                lineTo(7f, 12f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _WalkieTalkie = it}
