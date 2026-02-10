package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Washer: ImageVector? = null

val Icons.Tr.Washer: ImageVector
    get() = _Washer ?: UXIcon(name = "Washer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(21f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(6.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(3f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(6f, 5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(9f, 4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(12f, 8f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(12f, 9f)
                curveToRelative(2.68f, 0f, 4.87f, 2.13f, 4.98f, 4.79f)
                curveToRelative(-0.31f, 0.24f, -1.04f, 0.71f, -1.98f, 0.71f)
                curveToRelative(-1.33f, 0f, -2.71f, -0.91f, -2.72f, -0.92f)
                curveToRelative(-0.07f, -0.04f, -1.65f, -1.08f, -3.28f, -1.08f)
                curveToRelative(-0.77f, 0f, -1.41f, 0.23f, -1.9f, 0.48f)
                curveToRelative(0.47f, -2.27f, 2.49f, -3.98f, 4.89f, -3.98f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-2.68f, 0f, -4.87f, -2.13f, -4.98f, -4.79f)
                curveToRelative(0.31f, -0.24f, 1.04f, -0.71f, 1.98f, -0.71f)
                curveToRelative(1.33f, 0f, 2.71f, 0.91f, 2.72f, 0.92f)
                curveToRelative(0.07f, 0.04f, 1.65f, 1.08f, 3.28f, 1.08f)
                curveToRelative(0.77f, 0f, 1.41f, -0.23f, 1.9f, -0.48f)
                curveToRelative(-0.47f, 2.27f, -2.49f, 3.98f, -4.89f, 3.98f)
                close()
            }
        }.also { _Washer = it}
