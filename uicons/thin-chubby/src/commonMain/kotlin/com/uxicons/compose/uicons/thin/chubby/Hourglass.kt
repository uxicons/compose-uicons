package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hourglass: ImageVector? = null

val Icons.Tc.Hourglass: ImageVector
    get() = _Hourglass ?: UXIcon(name = "Hourglass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.51f, 12f)
                curveToRelative(1.67f, -1.2f, 3.61f, -3.36f, 4.57f, -7.2f)
                curveToRelative(0.03f, -0.1f, 0.02f, -0.21f, -0.02f, -0.32f)
                curveToRelative(-0.06f, -0.14f, -1.54f, -3.48f, -8.05f, -3.48f)
                reflectiveCurveTo(4.01f, 4.34f, 3.95f, 4.48f)
                curveToRelative(-0.04f, 0.1f, -0.05f, 0.21f, -0.02f, 0.32f)
                curveToRelative(0.96f, 3.84f, 2.9f, 6.0f, 4.57f, 7.2f)
                curveToRelative(-1.67f, 1.2f, -3.61f, 3.36f, -4.57f, 7.2f)
                curveToRelative(-0.03f, 0.1f, -0.02f, 0.21f, 0.02f, 0.32f)
                curveToRelative(0.06f, 0.14f, 1.54f, 3.48f, 8.05f, 3.48f)
                reflectiveCurveToRelative(7.99f, -3.34f, 8.05f, -3.48f)
                curveToRelative(0.04f, -0.1f, 0.05f, -0.21f, 0.02f, -0.32f)
                curveToRelative(-0.96f, -3.84f, -2.9f, -6.0f, -4.57f, -7.2f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.13f, 0f, -6.73f, -2.17f, -7.06f, -2.74f)
                curveToRelative(1.02f, -3.9f, 3.12f, -5.87f, 4.72f, -6.83f)
                curveToRelative(0.15f, -0.09f, 0.24f, -0.25f, 0.24f, -0.43f)
                reflectiveCurveToRelative(-0.09f, -0.34f, -0.24f, -0.43f)
                curveToRelative(-1.59f, -0.96f, -3.69f, -2.93f, -4.72f, -6.83f)
                curveToRelative(0.34f, -0.58f, 1.93f, -2.74f, 7.06f, -2.74f)
                reflectiveCurveToRelative(6.73f, 2.17f, 7.06f, 2.74f)
                curveToRelative(-1.02f, 3.9f, -3.12f, 5.87f, -4.72f, 6.83f)
                curveToRelative(-0.15f, 0.09f, -0.24f, 0.25f, -0.24f, 0.43f)
                reflectiveCurveToRelative(0.09f, 0.34f, 0.24f, 0.43f)
                curveToRelative(1.59f, 0.97f, 3.69f, 2.93f, 4.72f, 6.83f)
                curveToRelative(-0.34f, 0.58f, -1.93f, 2.74f, -7.06f, 2.74f)
                close()
            }
        }.also { _Hourglass = it}
