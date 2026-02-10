package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Scythe: ImageVector? = null

val Icons.Tr.Scythe: ImageVector
    get() = _Scythe ?: UXIcon(name = "Scythe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.58f, 0.84f)
                curveToRelative(-0.4f, -0.53f, -1.01f, -0.84f, -1.68f, -0.84f)
                horizontalLineToRelative(-6.56f)
                curveTo(9.38f, 0f, 4.3f, 2.44f, 0.25f, 7.24f)
                curveToRelative(-0.31f, 0.37f, -0.34f, 0.89f, -0.06f, 1.3f)
                curveToRelative(0.28f, 0.4f, 0.78f, 0.56f, 1.23f, 0.4f)
                curveToRelative(0.29f, -0.1f, 0.6f, -0.22f, 0.93f, -0.34f)
                curveToRelative(1.8f, -0.67f, 4.27f, -1.59f, 6.88f, -1.59f)
                horizontalLineToRelative(12.41f)
                lineToRelative(-1.7f, 6f)
                horizontalLineToRelative(-6.45f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(6.17f)
                lineToRelative(-2.65f, 9.36f)
                curveToRelative(-0.07f, 0.27f, 0.08f, 0.54f, 0.35f, 0.62f)
                curveToRelative(0.04f, 0.01f, 0.09f, 0.02f, 0.14f, 0.02f)
                curveToRelative(0.22f, 0f, 0.42f, -0.14f, 0.48f, -0.36f)
                lineTo(23.91f, 2.69f)
                curveToRelative(0.19f, -0.64f, 0.07f, -1.31f, -0.33f, -1.85f)
                close()
                moveTo(22.95f, 2.41f)
                lineToRelative(-1.02f, 3.59f)
                horizontalLineToRelative(-12.69f)
                curveToRelative(-2.79f, 0f, -5.36f, 0.96f, -7.23f, 1.66f)
                curveToRelative(-0.33f, 0.12f, -0.63f, 0.24f, -0.92f, 0.34f)
                lineToRelative(-0.07f, -0.11f)
                curveTo(4.87f, 3.32f, 9.69f, 1f, 15.35f, 1f)
                horizontalLineToRelative(6.56f)
                curveToRelative(0.35f, 0f, 0.67f, 0.16f, 0.88f, 0.44f)
                curveToRelative(0.21f, 0.28f, 0.27f, 0.63f, 0.17f, 0.97f)
                close()
            }
        }.also { _Scythe = it}
