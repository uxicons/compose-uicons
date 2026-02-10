package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Patient: ImageVector? = null

val Icons.Rr.Patient: ImageVector
    get() = _Patient ?: UXIcon(name = "Patient") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(10.75f, 16.22f)
                curveToRelative(-0.57f, -0.15f, -1.16f, -0.22f, -1.75f, -0.22f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                curveToRelative(0.76f, 0f, 1.52f, 0.1f, 2.25f, 0.28f)
                curveToRelative(0.54f, 0.14f, 0.86f, 0.68f, 0.72f, 1.22f)
                curveToRelative(-0.14f, 0.54f, -0.68f, 0.86f, -1.22f, 0.72f)
                close()
                moveTo(24f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.47f)
                lineToRelative(-1.7f, 2.56f)
                curveToRelative(-0.2f, 0.3f, -0.54f, 0.47f, -0.89f, 0.44f)
                curveToRelative(-0.36f, -0.02f, -0.67f, -0.23f, -0.83f, -0.55f)
                lineToRelative(-2.23f, -4.46f)
                lineToRelative(-1.04f, 1.57f)
                curveToRelative(-0.19f, 0.28f, -0.5f, 0.45f, -0.83f, 0.45f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.47f)
                lineToRelative(1.7f, -2.56f)
                curveToRelative(0.2f, -0.3f, 0.54f, -0.47f, 0.89f, -0.44f)
                curveToRelative(0.36f, 0.02f, 0.67f, 0.23f, 0.83f, 0.55f)
                lineToRelative(2.23f, 4.46f)
                lineToRelative(1.04f, -1.57f)
                curveToRelative(0.19f, -0.28f, 0.5f, -0.45f, 0.83f, -0.45f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Patient = it}
