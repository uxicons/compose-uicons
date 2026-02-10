package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserGraduate: ImageVector? = null

val Icons.Ss.UserGraduate: ImageVector
    get() = _UserGraduate ?: UXIcon(name = "UserGraduate") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 22.5f)
                verticalLineToRelative(1.5f)
                lineTo(4f, 24f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(0.18f)
                lineToRelative(3.33f, 4f)
                lineToRelative(3.33f, -4f)
                horizontalLineToRelative(0.15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(13.72f, 0.39f)
                curveToRelative(-1.05f, -0.52f, -2.4f, -0.52f, -3.45f, 0f)
                lineTo(2.06f, 4.5f)
                lineToRelative(8.22f, 4.11f)
                curveToRelative(0.52f, 0.26f, 1.12f, 0.39f, 1.72f, 0.39f)
                reflectiveCurveToRelative(1.2f, -0.13f, 1.72f, -0.39f)
                lineToRelative(6.28f, -3.14f)
                verticalLineToRelative(6.53f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.5f)
                lineTo(13.72f, 0.39f)
                close()
                moveTo(18f, 8.71f)
                lineToRelative(-3.38f, 1.69f)
                curveToRelative(-0.79f, 0.4f, -1.69f, 0.6f, -2.62f, 0.6f)
                reflectiveCurveToRelative(-1.83f, -0.21f, -2.62f, -0.6f)
                lineToRelative(-3.38f, -1.69f)
                verticalLineToRelative(1.29f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                verticalLineToRelative(-1.29f)
                close()
            }
        }.also { _UserGraduate = it}
