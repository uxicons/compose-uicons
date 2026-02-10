package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LifeRing: ImageVector? = null

val Icons.Tr.LifeRing: ImageVector
    get() = _LifeRing ?: UXIcon(name = "LifeRing") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.82f, 20.11f)
                curveToRelative(1.97f, -2.14f, 3.18f, -4.98f, 3.18f, -8.11f)
                reflectiveCurveToRelative(-1.21f, -5.97f, -3.18f, -8.11f)
                lineToRelative(0.54f, -0.54f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-0.54f, 0.54f)
                curveToRelative(-2.14f, -1.97f, -4.98f, -3.18f, -8.11f, -3.18f)
                reflectiveCurveTo(6.03f, 1.21f, 3.89f, 3.18f)
                lineToRelative(-0.54f, -0.54f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(0.54f, 0.54f)
                curveTo(1.21f, 6.03f, 0f, 8.87f, 0f, 12f)
                reflectiveCurveToRelative(1.21f, 5.97f, 3.18f, 8.11f)
                lineToRelative(-0.54f, 0.54f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(0.54f, -0.54f)
                curveToRelative(2.14f, 1.97f, 4.98f, 3.18f, 8.11f, 3.18f)
                reflectiveCurveToRelative(5.97f, -1.21f, 8.11f, -3.18f)
                lineToRelative(0.54f, 0.54f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-0.54f, -0.54f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 2.85f, -1.1f, 5.45f, -2.89f, 7.4f)
                lineToRelative(-4.26f, -4.26f)
                curveToRelative(0.7f, -0.86f, 1.15f, -1.95f, 1.15f, -3.15f)
                reflectiveCurveToRelative(-0.44f, -2.28f, -1.15f, -3.15f)
                lineToRelative(4.26f, -4.26f)
                curveToRelative(1.79f, 1.96f, 2.89f, 4.55f, 2.89f, 7.4f)
                close()
                moveTo(8f, 12f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(12f, 1f)
                curveToRelative(2.85f, 0f, 5.45f, 1.1f, 7.4f, 2.89f)
                lineToRelative(-4.26f, 4.26f)
                curveToRelative(-0.86f, -0.7f, -1.95f, -1.15f, -3.15f, -1.15f)
                reflectiveCurveToRelative(-2.28f, 0.44f, -3.15f, 1.15f)
                lineTo(4.6f, 3.89f)
                curveToRelative(1.96f, -1.79f, 4.55f, -2.89f, 7.4f, -2.89f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -2.85f, 1.1f, -5.45f, 2.89f, -7.4f)
                lineToRelative(4.26f, 4.26f)
                curveToRelative(-0.7f, 0.86f, -1.15f, 1.95f, -1.15f, 3.15f)
                reflectiveCurveToRelative(0.44f, 2.28f, 1.15f, 3.15f)
                lineToRelative(-4.26f, 4.26f)
                curveToRelative(-1.79f, -1.96f, -2.89f, -4.55f, -2.89f, -7.4f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-2.85f, 0f, -5.45f, -1.1f, -7.4f, -2.89f)
                lineToRelative(4.26f, -4.26f)
                curveToRelative(0.86f, 0.7f, 1.95f, 1.15f, 3.15f, 1.15f)
                reflectiveCurveToRelative(2.28f, -0.44f, 3.15f, -1.15f)
                lineToRelative(4.26f, 4.26f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                close()
            }
        }.also { _LifeRing = it}
