package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashClock: ImageVector? = null

val Icons.Tr.TrashClock: ImageVector
    get() = _TrashClock ?: UXIcon(name = "TrashClock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(18.85f, 18.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-1f, -1f)
                curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.79f)
                lineToRelative(0.85f, 0.85f)
                close()
                moveTo(10.5f, 23f)
                horizontalLineToRelative(-2.63f)
                curveToRelative(-1.82f, 0f, -3.31f, -1.36f, -3.48f, -3.17f)
                lineToRelative(-1.39f, -14.83f)
                horizontalLineToRelative(15.99f)
                lineToRelative(-0.32f, 3.45f)
                curveToRelative(-0.03f, 0.28f, 0.18f, 0.52f, 0.45f, 0.54f)
                curveToRelative(0.02f, 0f, 0.03f, 0.0f, 0.05f, 0.0f)
                curveToRelative(0.26f, 0f, 0.47f, -0.19f, 0.5f, -0.45f)
                lineToRelative(0.32f, -3.5f)
                curveToRelative(0.0f, -0.01f, 0.0f, -0.03f, 0.0f, -0.05f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.03f)
                curveToRelative(-0.25f, -2.25f, -2.16f, -4f, -4.47f, -4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.31f, 0f, -4.22f, 1.75f, -4.47f, 4f)
                lineTo(0.5f, 4f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0f, 0.02f, 0f, 0.03f, 0.0f, 0.05f)
                lineToRelative(1.39f, 14.87f)
                curveToRelative(0.22f, 2.33f, 2.14f, 4.08f, 4.48f, 4.08f)
                horizontalLineToRelative(2.63f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(10f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                lineTo(6.54f, 4f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                close()
            }
        }.also { _TrashClock = it}
