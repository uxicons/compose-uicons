package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToEye: ImageVector? = null

val Icons.Bs.ArrowsToEye: ImageVector
    get() = _ArrowsToEye ?: UXIcon(name = "ArrowsToEye") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.75f, 13.08f)
                curveToRelative(0.34f, -0.68f, 0.34f, -1.47f, 0f, -2.15f)
                curveToRelative(-0.8f, -1.61f, -3.74f, -4.92f, -7.75f, -4.92f)
                reflectiveCurveToRelative(-6.95f, 3.32f, -7.75f, 4.92f)
                curveToRelative(-0.34f, 0.69f, -0.34f, 1.47f, 0f, 2.15f)
                curveToRelative(0.8f, 1.61f, 3.74f, 4.92f, 7.75f, 4.92f)
                reflectiveCurveToRelative(6.95f, -3.32f, 7.75f, -4.92f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.48f, 0f, -4.34f, -2.15f, -4.9f, -3f)
                curveToRelative(0.57f, -0.85f, 2.42f, -3f, 4.9f, -3f)
                reflectiveCurveToRelative(4.34f, 2.15f, 4.9f, 3f)
                curveToRelative(-0.57f, 0.85f, -2.42f, 3f, -4.9f, 3f)
                close()
                moveTo(14f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(17f, 6f)
                lineTo(17f, 1f)
                lineToRelative(1.94f, 1.94f)
                lineTo(21.84f, 0.04f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.9f, 2.9f)
                lineToRelative(1.94f, 1.94f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(2.94f, 5.06f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.9f, 2.9f)
                lineToRelative(1.94f, -1.94f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 7f)
                lineToRelative(1.94f, -1.94f)
                close()
                moveTo(21.06f, 18.94f)
                lineToRelative(2.9f, 2.9f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.9f, -2.9f)
                lineToRelative(-1.94f, 1.94f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5f)
                lineToRelative(-1.94f, 1.94f)
                close()
                moveTo(7.0f, 18.0f)
                verticalLineToRelative(5f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-2.9f, 2.9f)
                lineTo(0.04f, 21.84f)
                lineToRelative(2.9f, -2.9f)
                lineToRelative(-1.94f, -1.94f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _ArrowsToEye = it}
