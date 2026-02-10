package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarAndCrescent: ImageVector? = null

val Icons.Ss.StarAndCrescent: ImageVector
    get() = _StarAndCrescent ?: UXIcon(name = "StarAndCrescent") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(1.62f, 0f, 2.96f, 0.25f, 4.1f, 0.75f)
                lineToRelative(2.29f, 1.02f)
                lineToRelative(-2.36f, 0.83f)
                curveToRelative(-4.14f, 1.46f, -7.02f, 5.32f, -7.02f, 9.39f)
                reflectiveCurveToRelative(2.89f, 7.93f, 7.02f, 9.39f)
                lineToRelative(2.43f, 0.86f)
                lineToRelative(-2.38f, 1.0f)
                curveToRelative(-1.24f, 0.52f, -2.46f, 0.75f, -4.07f, 0.75f)
                close()
                moveTo(19.01f, 14.41f)
                lineToRelative(2.82f, 1.95f)
                lineToRelative(0.68f, -0.48f)
                lineToRelative(-1.06f, -3.32f)
                lineToRelative(2.54f, -1.74f)
                verticalLineToRelative(-0.83f)
                horizontalLineToRelative(-3.48f)
                lineToRelative(-1.07f, -3.64f)
                horizontalLineToRelative(-0.88f)
                lineToRelative(-1.07f, 3.64f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(0.84f)
                lineToRelative(2.57f, 1.68f)
                lineToRelative(-0.98f, 3.35f)
                lineToRelative(0.66f, 0.49f)
                lineToRelative(2.78f, -1.95f)
                close()
            }
        }.also { _StarAndCrescent = it}
