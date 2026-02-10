package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Exchange: ImageVector? = null

val Icons.Tr.Exchange: ImageVector
    get() = _Exchange ?: UXIcon(name = "Exchange") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.5f, 8f)
                horizontalLineTo(22.86f)
                curveToRelative(-0.04f, 0.07f, -0.07f, 0.15f, -0.13f, 0.22f)
                curveToRelative(-0.21f, 0.24f, -0.42f, 0.46f, -0.56f, 0.61f)
                lineToRelative(-2.24f, 2.28f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.51f, 0.01f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.22f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.36f, -0.15f)
                lineToRelative(2.24f, -2.28f)
                curveToRelative(0.16f, -0.16f, 0.38f, -0.4f, 0.6f, -0.65f)
                curveToRelative(0.7f, -0.79f, 0.7f, -1.98f, 0f, -2.77f)
                curveToRelative(-0.23f, -0.26f, -0.45f, -0.5f, -0.6f, -0.65f)
                lineToRelative(-2.24f, -2.28f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                lineToRelative(2.25f, 2.29f)
                curveToRelative(0.15f, 0.15f, 0.35f, 0.37f, 0.56f, 0.61f)
                curveToRelative(0.06f, 0.07f, 0.09f, 0.14f, 0.13f, 0.22f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 16f)
                horizontalLineTo(1.14f)
                curveToRelative(0.04f, -0.07f, 0.07f, -0.15f, 0.13f, -0.22f)
                curveToRelative(0.21f, -0.24f, 0.42f, -0.46f, 0.56f, -0.61f)
                lineToRelative(2.25f, -2.28f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                lineToRelative(-2.24f, 2.28f)
                curveToRelative(-0.16f, 0.16f, -0.38f, 0.4f, -0.6f, 0.65f)
                curveToRelative(-0.7f, 0.79f, -0.7f, 1.98f, 0f, 2.77f)
                curveToRelative(0.23f, 0.25f, 0.45f, 0.5f, 0.6f, 0.65f)
                lineToRelative(2.25f, 2.28f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.13f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                lineToRelative(-2.25f, -2.29f)
                curveToRelative(-0.15f, -0.15f, -0.35f, -0.37f, -0.56f, -0.61f)
                curveToRelative(-0.06f, -0.07f, -0.09f, -0.14f, -0.13f, -0.22f)
                horizontalLineTo(23.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _Exchange = it}
