package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shop: ImageVector? = null

val Icons.Ts.Shop: ImageVector
    get() = _Shop ?: UXIcon(name = "Shop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                lineTo(21.9f, 0f)
                lineTo(2.1f, 0f)
                lineTo(0f, 9.5f)
                curveToRelative(0f, 0.98f, 0.41f, 1.86f, 1.06f, 2.5f)
                horizontalLineToRelative(-0.06f)
                verticalLineToRelative(9.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-9.5f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(0.65f, -0.64f, 1.06f, -1.52f, 1.06f, -2.5f)
                close()
                moveTo(1f, 9.55f)
                lineTo(2.9f, 1f)
                horizontalLineToRelative(4.1f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                lineTo(8f, 1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1f)
                lineTo(17f, 1f)
                horizontalLineToRelative(4.1f)
                lineToRelative(1.9f, 8.55f)
                curveToRelative(-0.03f, 1.35f, -1.14f, 2.45f, -2.5f, 2.45f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.36f, 0f, -2.47f, -1.09f, -2.5f, -2.45f)
                close()
                moveTo(22f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(3.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-8.85f)
                curveToRelative(0.46f, 0.22f, 0.96f, 0.35f, 1.5f, 0.35f)
                horizontalLineToRelative(1f)
                curveToRelative(1.28f, 0f, 2.39f, -0.7f, 3f, -1.73f)
                curveToRelative(0.61f, 1.03f, 1.72f, 1.73f, 3f, 1.73f)
                horizontalLineToRelative(3f)
                curveToRelative(1.28f, 0f, 2.39f, -0.7f, 3f, -1.73f)
                curveToRelative(0.61f, 1.03f, 1.72f, 1.73f, 3f, 1.73f)
                horizontalLineToRelative(1f)
                curveToRelative(0.54f, 0f, 1.04f, -0.13f, 1.5f, -0.35f)
                verticalLineToRelative(8.85f)
                close()
            }
        }.also { _Shop = it}
