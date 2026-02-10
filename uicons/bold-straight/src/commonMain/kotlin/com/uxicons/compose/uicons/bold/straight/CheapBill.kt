package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheapBill: ImageVector? = null

val Icons.Bs.CheapBill: ImageVector
    get() = _CheapBill ?: UXIcon(name = "CheapBill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(5.5f, 0f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(8.5f)
                lineToRelative(-0.01f, 5.3f)
                lineToRelative(-1.89f, -1.89f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(3.74f, 3.74f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                curveToRelative(0.64f, 0f, 1.27f, -0.24f, 1.75f, -0.72f)
                lineToRelative(3.8f, -3.71f)
                lineToRelative(-2.1f, -2.15f)
                lineToRelative(-1.96f, 1.91f)
                lineToRelative(0.01f, -5.33f)
                horizontalLineToRelative(8.5f)
                close()
                moveTo(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                lineTo(5f, 11f)
                lineTo(5f, 3.5f)
                close()
                moveTo(15f, 7f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
            }
        }.also { _CheapBill = it}
