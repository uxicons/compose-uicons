package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceWeary: ImageVector? = null

val Icons.Br.FaceWeary: ImageVector
    get() = _FaceWeary ?: UXIcon(name = "FaceWeary") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(10.56f, 9.58f)
            curveToRelative(-0.95f, 0.92f, -2.23f, 1.42f, -3.58f, 1.42f)
            curveToRelative(-0.22f, 0f, -0.43f, -0.01f, -0.65f, -0.04f)
            curveToRelative(-0.82f, -0.1f, -1.41f, -0.84f, -1.31f, -1.67f)
            curveToRelative(0.1f, -0.82f, 0.84f, -1.41f, 1.67f, -1.31f)
            curveToRelative(0.41f, 0.05f, 1.18f, 0.04f, 1.79f, -0.56f)
            curveToRelative(0.59f, -0.58f, 1.54f, -0.56f, 2.12f, 0.03f)
            curveToRelative(0.58f, 0.59f, 0.56f, 1.54f, -0.03f, 2.12f)
            close()
            moveTo(17.68f, 10.96f)
            curveToRelative(-0.22f, 0.03f, -0.44f, 0.04f, -0.65f, 0.04f)
            curveToRelative(-1.35f, 0f, -2.62f, -0.5f, -3.56f, -1.4f)
            curveToRelative(-0.6f, -0.57f, -0.62f, -1.52f, -0.04f, -2.12f)
            curveToRelative(0.57f, -0.6f, 1.52f, -0.62f, 2.12f, -0.04f)
            curveToRelative(0.61f, 0.59f, 1.38f, 0.6f, 1.78f, 0.55f)
            curveToRelative(0.82f, -0.09f, 1.57f, 0.49f, 1.67f, 1.31f)
            curveToRelative(0.1f, 0.82f, -0.49f, 1.57f, -1.31f, 1.67f)
            close()
            moveTo(16.7f, 15.62f)
            curveToRelative(0.8f, 0.96f, -0.15f, 2.37f, -1.33f, 1.97f)
            curveToRelative(-0.82f, -0.27f, -1.83f, -0.59f, -3.37f, -0.59f)
            curveToRelative(-1.54f, 0f, -2.55f, 0.32f, -3.37f, 0.59f)
            curveToRelative(-1.19f, 0.39f, -2.14f, -1.02f, -1.33f, -1.97f)
            curveToRelative(0.99f, -1.19f, 2.5f, -2.61f, 4.7f, -2.61f)
            reflectiveCurveToRelative(3.71f, 1.43f, 4.7f, 2.61f)
            close()
        }
    }.also { _FaceWeary = it }
