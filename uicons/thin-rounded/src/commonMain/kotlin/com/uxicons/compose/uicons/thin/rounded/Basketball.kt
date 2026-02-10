package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Basketball: ImageVector? = null

val Icons.Tr.Basketball: ImageVector
    get() = _Basketball ?: UXIcon(name = "Basketball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.48f, 3.52f)
                curveTo(18.31f, 1.36f, 15.29f, 0f, 12f, 0f)
                reflectiveCurveTo(5.68f, 1.35f, 3.51f, 3.51f)
                curveTo(1.36f, 5.68f, 0f, 8.71f, 0f, 12f)
                reflectiveCurveToRelative(1.36f, 6.32f, 3.52f, 8.49f)
                curveToRelative(2.17f, 2.16f, 5.19f, 3.51f, 8.48f, 3.51f)
                reflectiveCurveToRelative(6.32f, -1.36f, 8.49f, -3.52f)
                curveToRelative(2.16f, -2.17f, 3.51f, -5.19f, 3.51f, -8.48f)
                reflectiveCurveToRelative(-1.36f, -6.31f, -3.52f, -8.48f)
                close()
                moveTo(22.97f, 11.48f)
                curveToRelative(-2.57f, -0.12f, -4.99f, -1.13f, -6.89f, -2.87f)
                lineToRelative(4.02f, -4.02f)
                curveToRelative(1.68f, 1.84f, 2.74f, 4.24f, 2.86f, 6.89f)
                close()
                moveTo(19.4f, 3.89f)
                lineToRelative(-4.02f, 4.02f)
                curveToRelative(-1.73f, -1.9f, -2.74f, -4.31f, -2.87f, -6.89f)
                curveToRelative(2.65f, 0.12f, 5.05f, 1.18f, 6.89f, 2.86f)
                close()
                moveTo(11.51f, 1.02f)
                curveToRelative(0.12f, 2.84f, 1.24f, 5.51f, 3.16f, 7.59f)
                lineToRelative(-2.67f, 2.67f)
                lineTo(4.6f, 3.89f)
                curveToRelative(1.84f, -1.69f, 4.26f, -2.75f, 6.92f, -2.86f)
                close()
                moveTo(3.89f, 4.59f)
                lineToRelative(7.4f, 7.4f)
                lineToRelative(-2.67f, 2.67f)
                curveToRelative(-2.09f, -1.92f, -4.75f, -3.04f, -7.59f, -3.16f)
                curveToRelative(0.12f, -2.66f, 1.18f, -5.07f, 2.86f, -6.92f)
                close()
                moveTo(1.03f, 12.52f)
                curveToRelative(2.57f, 0.12f, 4.99f, 1.13f, 6.89f, 2.87f)
                lineToRelative(-4.02f, 4.02f)
                curveToRelative(-1.68f, -1.84f, -2.74f, -4.24f, -2.86f, -6.89f)
                close()
                moveTo(4.6f, 20.11f)
                lineToRelative(4.02f, -4.02f)
                curveToRelative(1.73f, 1.9f, 2.74f, 4.31f, 2.87f, 6.89f)
                curveToRelative(-2.65f, -0.12f, -5.05f, -1.18f, -6.89f, -2.86f)
                close()
                moveTo(12.49f, 22.98f)
                curveToRelative(-0.12f, -2.84f, -1.24f, -5.51f, -3.16f, -7.59f)
                lineToRelative(2.67f, -2.67f)
                lineToRelative(7.4f, 7.4f)
                curveToRelative(-1.84f, 1.69f, -4.26f, 2.75f, -6.92f, 2.86f)
                close()
                moveTo(20.11f, 19.4f)
                lineToRelative(-7.4f, -7.4f)
                lineToRelative(2.67f, -2.67f)
                curveToRelative(2.09f, 1.92f, 4.75f, 3.04f, 7.59f, 3.16f)
                curveToRelative(-0.12f, 2.66f, -1.18f, 5.07f, -2.86f, 6.92f)
                close()
            }
        }.also { _Basketball = it}
