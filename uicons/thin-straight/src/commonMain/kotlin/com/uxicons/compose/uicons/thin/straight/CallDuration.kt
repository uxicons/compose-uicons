package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallDuration: ImageVector? = null

val Icons.Ts.CallDuration: ImageVector
    get() = _CallDuration ?: UXIcon(name = "CallDuration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.82f, 17.35f)
                curveToRelative(-3.31f, -1.35f, -5.71f, -3.76f, -7.16f, -7.17f)
                lineToRelative(3.29f, -3.29f)
                lineTo(4.39f, 1.33f)
                lineToRelative(-2.82f, 2.82f)
                curveTo(0.56f, 5.16f, 0f, 6.53f, 0f, 8f)
                curveTo(0f, 15.03f, 8.97f, 24f, 16f, 24f)
                curveToRelative(1.48f, 0f, 2.84f, -0.56f, 3.85f, -1.57f)
                lineToRelative(2.82f, -2.82f)
                lineToRelative(-5.56f, -5.56f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(19.15f, 21.72f)
                curveToRelative(-0.82f, 0.82f, -1.94f, 1.28f, -3.15f, 1.28f)
                curveToRelative(-6.45f, 0f, -15f, -8.55f, -15f, -15f)
                curveToRelative(0f, -1.21f, 0.45f, -2.33f, 1.28f, -3.15f)
                lineToRelative(2.11f, -2.11f)
                lineToRelative(4.14f, 4.14f)
                lineToRelative(-3.06f, 3.06f)
                lineToRelative(0.12f, 0.31f)
                curveToRelative(1.59f, 3.95f, 4.33f, 6.7f, 8.16f, 8.16f)
                lineToRelative(0.3f, 0.12f)
                lineToRelative(3.05f, -3.05f)
                lineToRelative(4.14f, 4.14f)
                lineToRelative(-2.11f, 2.11f)
                close()
                moveTo(17.5f, 13f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveTo(21.08f, 0f, 17.5f, 0f)
                reflectiveCurveToRelative(-6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                close()
                moveTo(17.5f, 1f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveToRelative(-5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                close()
                moveTo(19.15f, 8.85f)
                lineToRelative(-2.15f, -2.15f)
                verticalLineToRelative(-3.71f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.29f)
                lineToRelative(1.85f, 1.85f)
                lineToRelative(-0.71f, 0.71f)
                close()
            }
        }.also { _CallDuration = it}
