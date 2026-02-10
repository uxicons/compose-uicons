package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAstronaut: ImageVector? = null

val Icons.Bs.UserAstronaut: ImageVector
    get() = _UserAstronaut ?: UXIcon(name = "UserAstronaut") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 11f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-1.52f)
                curveTo(19.24f, 2.51f, 15.91f, 0f, 12f, 0f)
                reflectiveCurveTo(4.76f, 2.51f, 3.52f, 6f)
                horizontalLineToRelative(-1.52f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(1.23f)
                curveToRelative(0.36f, 1.58f, 1.14f, 3.0f, 2.21f, 4.14f)
                curveToRelative(-1.97f, 0.48f, -3.44f, 2.25f, -3.44f, 4.36f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.11f, -1.47f, -3.88f, -3.44f, -4.36f)
                curveToRelative(1.07f, -1.14f, 1.85f, -2.56f, 2.21f, -4.14f)
                horizontalLineToRelative(1.23f)
                close()
                moveTo(12f, 3f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                close()
                moveTo(17f, 21f)
                verticalLineToRelative(3f)
                lineTo(7f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(7f, 8f)
                curveToRelative(0f, -0.34f, 0.36f, -1f, 1.1f, -1f)
                horizontalLineToRelative(7.9f)
                curveToRelative(0.72f, 0f, 1f, 0.66f, 1f, 1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                close()
            }
        }.also { _UserAstronaut = it}
