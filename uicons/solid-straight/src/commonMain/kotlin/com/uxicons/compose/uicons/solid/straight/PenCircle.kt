package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenCircle: ImageVector? = null

val Icons.Ss.PenCircle: ImageVector
    get() = _PenCircle ?: UXIcon(name = "PenCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.21f, 7.79f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(-1.04f, 1.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.04f, -1.04f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                close()
                moveTo(12.34f, 10.25f)
                lineToRelative(-4.34f, 4.34f)
                verticalLineToRelative(1.41f)
                horizontalLineToRelative(1.41f)
                lineToRelative(4.34f, -4.34f)
                lineToRelative(-1.41f, -1.41f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17.62f, 6.38f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-7.38f, 7.38f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(7.38f, -7.38f)
                curveToRelative(1.17f, -1.17f, 1.17f, -3.07f, 0f, -4.24f)
                close()
            }
        }.also { _PenCircle = it}
