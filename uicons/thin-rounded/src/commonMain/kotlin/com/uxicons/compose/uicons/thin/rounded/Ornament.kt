package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ornament: ImageVector? = null

val Icons.Tr.Ornament: ImageVector
    get() = _Ornament ?: UXIcon(name = "Ornament") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 5.16f)
                verticalLineToRelative(-1.16f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-0.59f)
                curveToRelative(0.06f, -0.16f, 0.09f, -0.33f, 0.09f, -0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                curveToRelative(0f, 0.17f, 0.03f, 0.34f, 0.09f, 0.5f)
                horizontalLineToRelative(-0.58f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(1.16f)
                curveToRelative(-3.76f, 1.54f, -6f, 4.82f, -6f, 8.84f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                curveToRelative(0f, -4.02f, -2.24f, -7.3f, -6f, -8.84f)
                close()
                moveTo(10f, 3f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.03f)
                lineToRelative(-6f, -0.03f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(8.59f, 6f)
                horizontalLineToRelative(6.82f)
                curveToRelative(3.56f, 1.37f, 5.59f, 4.28f, 5.59f, 8f)
                curveToRelative(0f, 0.48f, -0.04f, 0.96f, -0.11f, 1.42f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.83f, -0.84f, -2.19f, -0.83f, -3.01f, -0.02f)
                lineToRelative(-2.3f, 2.06f)
                curveToRelative(-0.21f, 0.21f, -0.49f, 0.33f, -0.79f, 0.33f)
                curveToRelative(-0.31f, 0f, -0.61f, -0.12f, -0.85f, -0.36f)
                lineToRelative(-2.21f, -2.0f)
                curveToRelative(-0.4f, -0.41f, -0.94f, -0.63f, -1.51f, -0.64f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.57f, 0f, -1.1f, 0.22f, -1.51f, 0.62f)
                lineToRelative(-2.8f, 2.78f)
                curveToRelative(-0.07f, -0.46f, -0.11f, -0.93f, -0.11f, -1.41f)
                curveToRelative(0f, -3.72f, 2.04f, -6.63f, 5.59f, -8f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-4.08f, 0f, -7.53f, -2.72f, -8.63f, -6.44f)
                lineToRelative(3.24f, -3.22f)
                curveToRelative(0.21f, -0.21f, 0.5f, -0.33f, 0.8f, -0.33f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.31f, 0.0f, 0.59f, 0.12f, 0.83f, 0.36f)
                lineToRelative(2.21f, 2.0f)
                curveToRelative(0.41f, 0.42f, 0.97f, 0.63f, 1.55f, 0.64f)
                curveToRelative(0.56f, -0.01f, 1.09f, -0.23f, 1.47f, -0.61f)
                lineToRelative(2.3f, -2.06f)
                curveToRelative(0.44f, -0.44f, 1.17f, -0.44f, 1.61f, 0f)
                lineToRelative(3.24f, 3.24f)
                curveToRelative(-1.11f, 3.71f, -4.56f, 6.43f, -8.62f, 6.43f)
                close()
            }
        }.also { _Ornament = it}
