package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TRex: ImageVector? = null

val Icons.Ss.TRex: ImageVector
    get() = _TRex ?: UXIcon(name = "TRex") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.3f, 0.13f)
                curveToRelative(-2.71f, -0.38f, -5.44f, 0.58f, -7.3f, 2.59f)
                curveToRelative(-2.28f, 2.47f, -5.4f, 6.39f, -7.36f, 11.04f)
                curveToRelative(-0.1f, 0.23f, -0.49f, 0.27f, -0.81f, 0.2f)
                curveToRelative(-0.68f, -0.14f, -1.83f, -0.86f, -1.83f, -2.69f)
                verticalLineToRelative(-3.28f)
                horizontalLineTo(0f)
                verticalLineToRelative(4.51f)
                curveToRelative(0f, 4.82f, 3.57f, 8.83f, 8.31f, 9.32f)
                curveToRelative(0.55f, 0.06f, 1.12f, 0.1f, 1.69f, 0.13f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.99f)
                curveToRelative(0.06f, 0f, 1.39f, -0.02f, 2f, -0.05f)
                verticalLineToRelative(2.03f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                horizontalLineToRelative(-0.06f)
                curveToRelative(0.33f, -0.67f, 0.68f, -1.31f, 1.05f, -1.94f)
                curveToRelative(3.53f, 0.39f, 6.45f, 2.82f, 7.54f, 6.09f)
                curveToRelative(0.24f, -0.69f, 0.47f, -1.57f, 0.47f, -2.65f)
                verticalLineToRelative(-2.25f)
                curveToRelative(0.51f, 0.21f, 1.14f, 0.61f, 1.7f, 1.35f)
                lineToRelative(1.6f, -1.2f)
                curveToRelative(-1.09f, -1.45f, -2.41f, -2.02f, -3.3f, -2.25f)
                verticalLineToRelative(-2.15f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-0.45f)
                curveToRelative(0f, -2.7f, -2.02f, -5.03f, -4.7f, -5.41f)
                close()
            }
        }.also { _TRex = it}
