package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPacifier: ImageVector? = null

val Icons.Ss.NoPacifier: ImageVector
    get() = _NoPacifier ?: UXIcon(name = "NoPacifier") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(19.74f, 18.32f)
                lineTo(16.56f, 15.14f)
                curveToRelative(0.8f, 0.22f, 1.61f, 0.35f, 2.44f, 0.35f)
                verticalLineToRelative(-2f)
                curveToRelative(-1.45f, 0f, -2.88f, -0.48f, -4.15f, -1.28f)
                curveToRelative(1.12f, -0.41f, 2.46f, -0.78f, 3.17f, -1.5f)
                curveToRelative(1.3f, -1.25f, 1.3f, -3.49f, 0f, -4.73f)
                curveToRelative(-1.22f, -1.22f, -3.52f, -1.22f, -4.73f, 0f)
                curveToRelative(-0.72f, 0.7f, -1.09f, 2.05f, -1.5f, 3.16f)
                curveToRelative(-0.8f, -1.27f, -1.28f, -2.7f, -1.28f, -4.14f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 0.83f, 0.13f, 1.65f, 0.35f, 2.44f)
                lineToRelative(-3.18f, -3.18f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.33f)
                close()
                moveTo(13.24f, 17.45f)
                curveToRelative(-0.87f, 0.95f, -2.1f, 1.55f, -3.49f, 1.55f)
                curveToRelative(-2.62f, 0f, -4.75f, -2.13f, -4.75f, -4.75f)
                curveToRelative(0f, -1.38f, 0.6f, -2.62f, 1.55f, -3.49f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(-0.58f, 0.51f, -0.96f, 1.24f, -0.96f, 2.07f)
                curveToRelative(0f, 1.52f, 1.23f, 2.75f, 2.75f, 2.75f)
                curveToRelative(0.83f, 0f, 1.57f, -0.38f, 2.07f, -0.96f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _NoPacifier = it}
