package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarAndCrescent: ImageVector? = null

val Icons.Bs.StarAndCrescent: ImageVector
    get() = _StarAndCrescent ?: UXIcon(name = "StarAndCrescent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 12f)
                curveToRelative(0f, -3.78f, 2.42f, -7.18f, 6.02f, -8.45f)
                lineToRelative(3.55f, -1.25f)
                lineToRelative(-3.44f, -1.53f)
                curveToRelative(-1.16f, -0.52f, -2.51f, -0.77f, -4.13f, -0.77f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                curveToRelative(1.62f, 0f, 2.85f, -0.23f, 4.1f, -0.76f)
                lineToRelative(3.56f, -1.51f)
                lineToRelative(-3.65f, -1.29f)
                curveToRelative(-3.6f, -1.27f, -6.02f, -4.67f, -6.02f, -8.45f)
                close()
                moveTo(3f, 12f)
                curveTo(3f, 7.35f, 6.54f, 3.52f, 11.06f, 3.05f)
                curveToRelative(-2.53f, 2.23f, -4.06f, 5.47f, -4.06f, 8.95f)
                reflectiveCurveToRelative(1.53f, 6.72f, 4.06f, 8.95f)
                curveToRelative(-4.52f, -0.47f, -8.06f, -4.31f, -8.06f, -8.95f)
                close()
                moveTo(24f, 10.83f)
                lineToRelative(-2.54f, 1.74f)
                lineToRelative(1.06f, 3.32f)
                lineToRelative(-0.68f, 0.48f)
                lineToRelative(-2.82f, -1.95f)
                lineToRelative(-2.78f, 1.95f)
                lineToRelative(-0.66f, -0.49f)
                lineToRelative(0.98f, -3.35f)
                lineToRelative(-2.57f, -1.68f)
                verticalLineToRelative(-0.84f)
                horizontalLineToRelative(3.5f)
                lineToRelative(1.07f, -3.64f)
                horizontalLineToRelative(0.88f)
                lineToRelative(1.07f, 3.64f)
                horizontalLineToRelative(3.48f)
                verticalLineToRelative(0.83f)
                close()
            }
        }.also { _StarAndCrescent = it}
