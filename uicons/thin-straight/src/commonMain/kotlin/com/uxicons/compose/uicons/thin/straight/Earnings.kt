package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Earnings: ImageVector? = null

val Icons.Ts.Earnings: ImageVector
    get() = _Earnings ?: UXIcon(name = "Earnings") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1.5f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 1.71f)
                lineTo(0.74f, 23.96f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(22.29f, 1f)
                horizontalLineToRelative(-8.79f)
                lineTo(13.5f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(0.23f, 0f, 0.45f, 0.06f, 0.64f, 0.15f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(0.01f, 0.01f)
                curveToRelative(0.3f, 0.15f, 0.54f, 0.39f, 0.68f, 0.68f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(0.09f, 0.2f, 0.15f, 0.41f, 0.15f, 0.64f)
                close()
                moveTo(2f, 5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(3f, 5.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(22f, 18.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 18.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _Earnings = it}
