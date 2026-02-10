package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugAlt: ImageVector? = null

val Icons.Tc.MugAlt: ImageVector
    get() = _MugAlt ?: UXIcon(name = "MugAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.39f, 6.44f)
                lineToRelative(0.4f, -3.2f)
                curveToRelative(0.03f, -0.26f, -0.14f, -0.5f, -0.4f, -0.55f)
                curveToRelative(-0.04f, -0.01f, -3.96f, -0.8f, -8.45f, -0.8f)
                reflectiveCurveTo(2.54f, 2.67f, 2.5f, 2.68f)
                curveToRelative(-0.26f, 0.05f, -0.43f, 0.29f, -0.4f, 0.55f)
                lineToRelative(1.89f, 15.18f)
                curveToRelative(0.02f, 0.18f, 0.14f, 0.34f, 0.31f, 0.4f)
                curveToRelative(0.08f, 0.03f, 2.11f, 0.82f, 6.64f, 0.82f)
                reflectiveCurveToRelative(6.56f, -0.79f, 6.64f, -0.82f)
                curveToRelative(0.17f, -0.07f, 0.29f, -0.22f, 0.31f, -0.4f)
                lineToRelative(0.46f, -3.7f)
                curveToRelative(0.16f, 0.02f, 0.33f, 0.03f, 0.49f, 0.03f)
                curveToRelative(2.29f, 0f, 4.14f, -1.87f, 4.14f, -4.17f)
                curveToRelative(0f, -2.12f, -1.54f, -3.87f, -3.61f, -4.14f)
                close()
                moveTo(16.95f, 17.98f)
                curveToRelative(-0.67f, 0.2f, -2.6f, 0.66f, -6.0f, 0.66f)
                reflectiveCurveToRelative(-5.33f, -0.46f, -6.0f, -0.66f)
                lineTo(3.16f, 3.58f)
                curveToRelative(1.14f, -0.2f, 4.29f, -0.69f, 7.79f, -0.69f)
                reflectiveCurveToRelative(6.65f, 0.49f, 7.79f, 0.69f)
                lineToRelative(-1.79f, 14.4f)
                close()
                moveTo(18.86f, 13.74f)
                curveToRelative(-0.12f, 0f, -0.25f, -0.01f, -0.37f, -0.02f)
                lineToRelative(0.78f, -6.29f)
                curveToRelative(1.56f, 0.2f, 2.73f, 1.53f, 2.73f, 3.14f)
                curveToRelative(0f, 1.75f, -1.41f, 3.17f, -3.14f, 3.17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.4f, 21.11f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(20.4f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _MugAlt = it}
