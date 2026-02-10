package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FitnessWatch: ImageVector? = null

val Icons.Bs.FitnessWatch: ImageVector
    get() = _FitnessWatch ?: UXIcon(name = "FitnessWatch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2.35f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(16f, 2f)
                lineTo(7.98f, 2f)
                lineToRelative(-0.02f, -2.02f)
                lineTo(4.96f, 0.02f)
                lineToRelative(0.03f, 2.34f)
                curveToRelative(-1.17f, 0.57f, -1.99f, 1.76f, -1.99f, 3.14f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.39f, 0.82f, 2.58f, 2f, 3.15f)
                verticalLineToRelative(2.35f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.35f)
                curveToRelative(1.18f, -0.56f, 2f, -1.76f, 2f, -3.15f)
                lineTo(21f, 5.5f)
                curveToRelative(0f, -1.39f, -0.82f, -2.58f, -2f, -3.15f)
                close()
                moveTo(18f, 18.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                lineTo(6.5f, 19f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(6f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13f)
                close()
                moveTo(16f, 11.2f)
                curveToRelative(0f, 2.3f, -4f, 5f, -4f, 5f)
                curveToRelative(0f, 0f, -4f, -2.7f, -4f, -5f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                curveToRelative(0f, -1.22f, 0.9f, -2.2f, 2f, -2.2f)
                reflectiveCurveToRelative(2f, 0.98f, 2f, 2.2f)
                close()
            }
        }.also { _FitnessWatch = it}
