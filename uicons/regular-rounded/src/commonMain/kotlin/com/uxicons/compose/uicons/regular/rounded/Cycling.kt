package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cycling: ImageVector? = null

val Icons.Rr.Cycling: ImageVector
    get() = _Cycling ?: UXIcon(name = "Cycling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 14f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(19.24f, 14.02f)
                lineTo(16.98f, 10.36f)
                curveToRelative(-0.13f, -0.21f, 0.01f, -0.36f, 0.26f, -0.36f)
                horizontalLineToRelative(1.76f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1.67f)
                curveToRelative(-0.17f, 0f, -0.33f, 0.02f, -0.49f, 0.06f)
                lineToRelative(-3.66f, -1.68f)
                curveToRelative(-1.42f, -0.79f, -3.23f, -0.29f, -4.06f, 1.12f)
                lineToRelative(-1.19f, 2.12f)
                curveToRelative(-0.45f, 0.73f, -0.56f, 1.62f, -0.3f, 2.44f)
                curveToRelative(0.24f, 0.79f, 0.81f, 1.45f, 1.55f, 1.81f)
                lineToRelative(1.81f, 1.17f)
                verticalLineToRelative(3.96f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.96f)
                curveToRelative(0f, -0.68f, -0.34f, -1.31f, -0.92f, -1.68f)
                curveToRelative(0f, 0f, -1.95f, -1.26f, -2.0f, -1.28f)
                curveToRelative(-0.27f, -0.12f, -0.46f, -0.34f, -0.54f, -0.62f)
                curveToRelative(-0.09f, -0.28f, -0.05f, -0.56f, 0.12f, -0.84f)
                lineToRelative(1.2f, -2.13f)
                curveToRelative(0.27f, -0.47f, 0.88f, -0.63f, 1.42f, -0.34f)
                lineToRelative(2.87f, 1.32f)
                curveToRelative(-0.22f, 0.56f, -0.25f, 1.24f, 0.04f, 1.79f)
                lineToRelative(1.92f, 3.11f)
                curveToRelative(-1.82f, 0.75f, -3.11f, 2.54f, -3.11f, 4.62f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.67f, -2.12f, -4.85f, -4.76f, -4.98f)
                close()
                moveTo(19f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(11f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _Cycling = it}
