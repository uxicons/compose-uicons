package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBill: ImageVector? = null

val Icons.Bs.HandBill: ImageVector
    get() = _HandBill ?: UXIcon(name = "HandBill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(9f, 4f)
                verticalLineToRelative(2.0f)
                lineToRelative(-6.62f, -0.01f)
                lineToRelative(-2.38f, 2.38f)
                verticalLineToRelative(4.24f)
                lineToRelative(3.62f, -3.62f)
                lineToRelative(3.01f, 0.01f)
                lineToRelative(-3.31f, 3.32f)
                lineToRelative(2.13f, 2.11f)
                lineToRelative(3.29f, -3.32f)
                curveToRelative(0.17f, -0.1f, 0.36f, -0.14f, 0.56f, -0.11f)
                curveToRelative(0.16f, 0.02f, 0.38f, 0.1f, 0.56f, 0.35f)
                curveToRelative(0.22f, 0.31f, 0.14f, 0.81f, -0.18f, 1.14f)
                lineToRelative(-3.77f, 3.77f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                lineTo(0f, 16.98f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.14f)
                curveToRelative(1.47f, 0f, 2.85f, -0.57f, 3.89f, -1.61f)
                lineToRelative(0.97f, -0.97f)
                verticalLineToRelative(2.6f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2.64f)
                curveToRelative(1.16f, -1.36f, 1.3f, -3.34f, 0.3f, -4.75f)
                curveToRelative(-0.09f, -0.13f, -0.2f, -0.23f, -0.3f, -0.34f)
                verticalLineToRelative(-2.26f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-15f)
                close()
                moveTo(18f, 12f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.34f, 3f, -3f)
                reflectiveCurveToRelative(-1.34f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.34f, -3f, 3f)
                close()
            }
        }.also { _HandBill = it}
