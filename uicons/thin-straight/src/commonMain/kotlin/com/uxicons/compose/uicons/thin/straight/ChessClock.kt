package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessClock: ImageVector? = null

val Icons.Ts.ChessClock: ImageVector
    get() = _ChessClock ?: UXIcon(name = "ChessClock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 7.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(6f, 5f)
                lineTo(6f, 2f)
                horizontalLineToRelative(3f)
                lineTo(9f, 1f)
                lineTo(2f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                lineTo(2.5f, 5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(2f, 21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                lineTo(21f, 21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                lineTo(24f, 7.5f)
                close()
                moveTo(23f, 20f)
                lineTo(1f, 20f)
                lineTo(1f, 7.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(22f, 4f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                close()
                moveTo(7f, 9f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(7f, 16f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                curveToRelative(1.21f, 0f, 2.24f, 0.72f, 2.72f, 1.75f)
                lineToRelative(-2.72f, 1.25f)
                lineToRelative(2.69f, 1.31f)
                curveToRelative(-0.49f, 1.0f, -1.5f, 1.7f, -2.69f, 1.7f)
                close()
                moveTo(17f, 9f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(2f, 0f, 4f, -1.5f, 4f, -4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(17f, 16f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 0.31f, -0.06f, 0.6f, -0.15f, 0.88f)
                lineToRelative(-2.85f, -0.89f)
                lineToRelative(0.83f, 2.87f)
                curveToRelative(-0.27f, 0.08f, -0.55f, 0.13f, -0.84f, 0.13f)
                close()
            }
        }.also { _ChessClock = it}
