package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Patient: ImageVector? = null

val Icons.Br.Patient: ImageVector
    get() = _Patient ?: UXIcon(name = "Patient") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8.99f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(8.99f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(23.99f, 18.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.71f)
            lineToRelative(-1.37f, 2.0f)
            curveToRelative(-0.29f, 0.43f, -0.79f, 0.67f, -1.3f, 0.65f)
            curveToRelative(-0.52f, -0.02f, -0.99f, -0.31f, -1.24f, -0.76f)
            lineToRelative(-1.98f, -3.52f)
            lineToRelative(-0.64f, 0.96f)
            curveToRelative(-0.28f, 0.42f, -0.75f, 0.67f, -1.25f, 0.67f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(0.7f)
            lineToRelative(1.55f, -2.33f)
            curveToRelative(0.29f, -0.43f, 0.77f, -0.68f, 1.3f, -0.67f)
            curveToRelative(0.52f, 0.02f, 0.99f, 0.31f, 1.25f, 0.76f)
            lineToRelative(2.0f, 3.55f)
            lineToRelative(0.46f, -0.67f)
            curveToRelative(0.28f, -0.41f, 0.74f, -0.65f, 1.24f, -0.65f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(9.99f, 15.42f)
            curveToRelative(0.06f, 0.83f, -0.57f, 1.54f, -1.4f, 1.59f)
            curveToRelative(-2.99f, 0.2f, -5.39f, 2.6f, -5.58f, 5.58f)
            curveToRelative(-0.05f, 0.83f, -0.78f, 1.46f, -1.59f, 1.4f)
            curveToRelative(-0.83f, -0.05f, -1.45f, -0.77f, -1.4f, -1.59f)
            curveToRelative(0.29f, -4.48f, 3.9f, -8.09f, 8.38f, -8.38f)
            curveToRelative(0.83f, -0.06f, 1.54f, 0.57f, 1.59f, 1.4f)
            close()
        }
    }.also { _Patient = it }
