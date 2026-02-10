package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Tr.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(1f, 12.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                curveToRelative(0.97f, 0f, 1.92f, -0.25f, 2.75f, -0.73f)
                curveToRelative(0.24f, -0.14f, 0.54f, -0.06f, 0.68f, 0.18f)
                curveToRelative(0.14f, 0.24f, 0.06f, 0.54f, -0.18f, 0.68f)
                curveToRelative(-0.98f, 0.57f, -2.11f, 0.87f, -3.25f, 0.87f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                lineTo(0.0f, 6.5f)
                curveTo(0f, 2.92f, 2.92f, 0f, 6.5f, 0f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveTo(1f, 3.47f, 1f, 6.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(9.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(13.28f, 21.02f)
                lineToRelative(7.74f, -7.74f)
                curveToRelative(-0.95f, -0.8f, -2.18f, -1.28f, -3.52f, -1.28f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                curveToRelative(0f, 1.34f, 0.48f, 2.56f, 1.28f, 3.52f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, -1.34f, -0.48f, -2.56f, -1.28f, -3.52f)
                lineToRelative(-7.74f, 7.74f)
                curveToRelative(0.95f, 0.8f, 2.18f, 1.28f, 3.52f, 1.28f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                close()
            }
        }.also { _Pills = it}
