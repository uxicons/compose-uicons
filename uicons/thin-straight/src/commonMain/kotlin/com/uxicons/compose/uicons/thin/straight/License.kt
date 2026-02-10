package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _License: ImageVector? = null

val Icons.Ts.License: ImageVector
    get() = _License ?: UXIcon(name = "License") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(2f, 24f)
                lineTo(10f, 24f)
                verticalLineToRelative(-1f)
                lineTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(14f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(14.5f, 13f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 0.95f, 0.38f, 1.82f, 1f, 2.45f)
                verticalLineToRelative(5.05f)
                lineToRelative(2.5f, -1.88f)
                lineToRelative(2.5f, 1.88f)
                verticalLineToRelative(-5.05f)
                curveToRelative(0.62f, -0.63f, 1f, -1.5f, 1f, -2.45f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(14.5f, 14f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(14.5f, 20.88f)
                lineToRelative(-1.5f, 1.12f)
                verticalLineToRelative(-2.34f)
                curveToRelative(0.45f, 0.22f, 0.96f, 0.34f, 1.5f, 0.34f)
                reflectiveCurveToRelative(1.05f, -0.12f, 1.5f, -0.34f)
                verticalLineToRelative(2.34f)
                lineToRelative(-1.5f, -1.12f)
                close()
            }
        }.also { _License = it}
