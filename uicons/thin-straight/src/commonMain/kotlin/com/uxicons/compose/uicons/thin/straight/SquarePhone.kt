package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhone: ImageVector? = null

val Icons.Ts.SquarePhone: ImageVector
    get() = _SquarePhone ?: UXIcon(name = "SquarePhone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.93f, 15.17f)
                curveToRelative(-1.08f, -0.46f, -2.22f, -1.24f, -3.04f, -2.06f)
                curveToRelative(-0.82f, -0.81f, -1.6f, -1.96f, -2.06f, -3.04f)
                lineToRelative(2.28f, -2.28f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-1.97f, 1.97f)
                curveToRelative(-0.74f, 0.74f, -1.15f, 1.74f, -1.15f, 2.82f)
                curveToRelative(0f, 2.34f, 1.43f, 5.18f, 3.82f, 7.6f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(2.41f, 2.39f, 5.25f, 3.82f, 7.6f, 3.82f)
                curveToRelative(1.08f, 0f, 2.08f, -0.41f, 2.82f, -1.15f)
                lineToRelative(1.97f, -1.97f)
                lineToRelative(-4.0f, -4.0f)
                close()
                moveTo(17.53f, 18.14f)
                curveToRelative(-0.55f, 0.55f, -1.3f, 0.86f, -2.11f, 0.86f)
                curveToRelative(-2.05f, 0f, -4.69f, -1.35f, -6.89f, -3.53f)
                curveToRelative(-2.18f, -2.2f, -3.53f, -4.84f, -3.53f, -6.89f)
                curveToRelative(0f, -0.81f, 0.3f, -1.56f, 0.85f, -2.11f)
                lineToRelative(1.26f, -1.26f)
                lineToRelative(2.58f, 2.58f)
                lineToRelative(-2.04f, 2.04f)
                curveToRelative(0.51f, 1.43f, 1.43f, 2.91f, 2.52f, 3.99f)
                curveToRelative(1.09f, 1.1f, 2.56f, 2.02f, 3.99f, 2.53f)
                lineToRelative(2.04f, -2.04f)
                lineToRelative(2.58f, 2.58f)
                lineToRelative(-1.26f, 1.26f)
                close()
                moveTo(21.5f, 0f)
                horizontalLineToRelative(-19f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                horizontalLineToRelative(-22f)
                verticalLineToRelative(-20.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _SquarePhone = it}
