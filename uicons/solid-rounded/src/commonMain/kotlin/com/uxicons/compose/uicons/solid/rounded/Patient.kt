package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Patient: ImageVector? = null

val Icons.Sr.Patient: ImageVector
    get() = _Patient ?: UXIcon(name = "Patient") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(19.83f, 22.55f)
                lineTo(21.54f, 20f)
                horizontalLineToRelative(1.47f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.33f, 0f, -0.65f, 0.17f, -0.83f, 0.45f)
                lineToRelative(-1.04f, 1.57f)
                lineToRelative(-2.23f, -4.46f)
                curveToRelative(-0.16f, -0.32f, -0.48f, -0.53f, -0.83f, -0.55f)
                curveToRelative(-0.35f, -0.03f, -0.7f, 0.15f, -0.89f, 0.44f)
                lineToRelative(-1.7f, 2.56f)
                horizontalLineToRelative(-1.47f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.33f, 0f, 0.65f, -0.17f, 0.83f, -0.45f)
                lineToRelative(1.04f, -1.57f)
                lineToRelative(2.23f, 4.46f)
                curveToRelative(0.16f, 0.32f, 0.48f, 0.53f, 0.83f, 0.55f)
                curveToRelative(0.35f, 0.02f, 0.7f, -0.15f, 0.89f, -0.44f)
                close()
                moveTo(16.32f, 23.34f)
                lineTo(15.46f, 21.62f)
                curveToRelative(-0.44f, 0.24f, -0.94f, 0.38f, -1.46f, 0.38f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(0.4f)
                lineToRelative(0.68f, -1.02f)
                curveToRelative(-1.22f, -0.62f, -2.61f, -0.98f, -4.07f, -0.98f)
                curveToRelative(-4.96f, 0f, -9.0f, 4.04f, -9.0f, 9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15.77f)
                curveToRelative(-0.18f, -0.2f, -0.33f, -0.42f, -0.45f, -0.66f)
                close()
            }
        }.also { _Patient = it}
