package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BusinessTime: ImageVector? = null

val Icons.Ss.BusinessTime: ImageVector
    get() = _BusinessTime ?: UXIcon(name = "BusinessTime") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19.29f, 20.71f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(-3.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.59f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(12.72f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 14f)
                lineTo(11.08f, 14f)
                curveToRelative(-0.68f, 1.18f, -1.08f, 2.54f, -1.08f, 4f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.72f, 6f)
                close()
                moveTo(18f, 10f)
                curveToRelative(2.39f, 0f, 4.53f, 1.06f, 6f, 2.72f)
                lineTo(24f, 7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                lineTo(18f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(8f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                lineTo(12.72f, 12f)
                curveToRelative(1.41f, -1.24f, 3.25f, -2f, 5.28f, -2f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                lineTo(8f, 4f)
                lineTo(8f, 2f)
                close()
            }
        }.also { _BusinessTime = it}
