package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TeamCheck: ImageVector? = null

val Icons.Sr.TeamCheck: ImageVector
    get() = _TeamCheck ?: UXIcon(name = "TeamCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(15.5f, 7f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(21.68f, 17.71f)
                lineToRelative(-2.7f, 2.61f)
                curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
                reflectiveCurveToRelative(-1.2f, -0.23f, -1.66f, -0.67f)
                lineToRelative(-1.35f, -1.33f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(1.35f, 1.33f)
                curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, -0.0f)
                lineToRelative(2.71f, -2.62f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                close()
                moveTo(10.5f, 15.21f)
                curveToRelative(-0.32f, 0.87f, -0.5f, 1.81f, -0.5f, 2.79f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                lineTo(1.03f, 18f)
                curveToRelative(-0.28f, 0f, -0.56f, -0.12f, -0.74f, -0.33f)
                reflectiveCurveToRelative(-0.28f, -0.49f, -0.25f, -0.78f)
                curveToRelative(0.31f, -2.79f, 2.66f, -4.89f, 5.47f, -4.89f)
                curveToRelative(2.21f, 0f, 4.13f, 1.3f, 5.0f, 3.21f)
                close()
                moveTo(11.63f, 13.17f)
                curveToRelative(-0.39f, -0.55f, -0.84f, -1.04f, -1.35f, -1.46f)
                curveToRelative(0.75f, -2.18f, 2.81f, -3.71f, 5.2f, -3.71f)
                curveToRelative(1.8f, 0f, 3.42f, 0.87f, 4.42f, 2.23f)
                curveToRelative(-0.61f, -0.15f, -1.24f, -0.23f, -1.9f, -0.23f)
                curveToRelative(-2.6f, 0f, -4.91f, 1.24f, -6.37f, 3.17f)
                close()
            }
        }.also { _TeamCheck = it}
