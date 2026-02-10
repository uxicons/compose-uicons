package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BreadSlice: ImageVector? = null

val Icons.Tr.BreadSlice: ImageVector
    get() = _BreadSlice ?: UXIcon(name = "BreadSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(8f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(22f, 8.49f)
                verticalLineToRelative(11.01f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(6.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-11.01f)
                curveTo(0.52f, 7.45f, -0.24f, 5.67f, 0.07f, 3.87f)
                curveTo(0.45f, 1.66f, 2.49f, 0f, 4.83f, 0f)
                horizontalLineToRelative(14.34f)
                curveToRelative(2.34f, 0f, 4.38f, 1.66f, 4.76f, 3.87f)
                curveToRelative(0.31f, 1.8f, -0.45f, 3.58f, -1.93f, 4.62f)
                close()
                moveTo(22.94f, 4.04f)
                curveToRelative(-0.3f, -1.73f, -1.92f, -3.04f, -3.77f, -3.04f)
                lineTo(4.83f, 1f)
                curveToRelative(-1.85f, 0f, -3.48f, 1.3f, -3.77f, 3.04f)
                curveToRelative(-0.26f, 1.51f, 0.4f, 2.95f, 1.71f, 3.76f)
                curveToRelative(0.15f, 0.09f, 0.24f, 0.25f, 0.24f, 0.43f)
                verticalLineToRelative(11.28f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-11.28f)
                curveToRelative(0f, -0.17f, 0.09f, -0.33f, 0.24f, -0.43f)
                curveToRelative(1.31f, -0.81f, 1.97f, -2.25f, 1.71f, -3.76f)
                close()
            }
        }.also { _BreadSlice = it}
