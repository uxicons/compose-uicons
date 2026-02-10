package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UnderConstruction: ImageVector? = null

val Icons.Br.UnderConstruction: ImageVector
    get() = _UnderConstruction ?: UXIcon(name = "UnderConstruction") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.41f, 8.14f)
            lineTo(15.85f, 1.59f)
            curveToRelative(-2.12f, -2.13f, -5.58f, -2.12f, -7.71f, 0f)
            lineTo(1.59f, 8.14f)
            curveToRelative(-2.12f, 2.12f, -2.12f, 5.58f, 0f, 7.71f)
            lineToRelative(6.55f, 6.55f)
            curveToRelative(1.03f, 1.03f, 2.4f, 1.6f, 3.85f, 1.6f)
            reflectiveCurveToRelative(2.83f, -0.57f, 3.85f, -1.6f)
            lineToRelative(6.55f, -6.55f)
            curveToRelative(2.12f, -2.12f, 2.12f, -5.58f, 0f, -7.71f)
            close()
            moveTo(20.28f, 13.73f)
            lineToRelative(-6.55f, 6.55f)
            curveToRelative(-0.93f, 0.93f, -2.54f, 0.93f, -3.47f, 0f)
            lineToRelative(-6.55f, -6.55f)
            curveToRelative(-0.96f, -0.96f, -0.96f, -2.51f, 0f, -3.47f)
            lineToRelative(6.55f, -6.55f)
            curveToRelative(0.96f, -0.95f, 2.51f, -0.96f, 3.47f, 0f)
            lineToRelative(6.55f, 6.55f)
            curveToRelative(0.46f, 0.46f, 0.72f, 1.08f, 0.72f, 1.73f)
            reflectiveCurveToRelative(-0.26f, 1.27f, -0.72f, 1.73f)
            close()
            moveTo(16f, 15f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            close()
            moveTo(14.52f, 12f)
            horizontalLineToRelative(-5.04f)
            lineToRelative(1.5f, -5.35f)
            curveToRelative(0.2f, -0.44f, 0.61f, -0.65f, 1.02f, -0.65f)
            reflectiveCurveToRelative(0.82f, 0.22f, 1.02f, 0.65f)
            lineToRelative(1.5f, 5.35f)
            close()
        }
    }.also { _UnderConstruction = it }
