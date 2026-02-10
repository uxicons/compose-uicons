package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Archway: ImageVector? = null

val Icons.Tr.Archway: ImageVector
    get() = _Archway ?: UXIcon(name = "Archway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.5f, 22f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(5.71f)
                lineToRelative(1.45f, -1.45f)
                curveToRelative(0.56f, -0.56f, 0.72f, -1.35f, 0.41f, -2.08f)
                reflectiveCurveToRelative(-0.98f, -1.18f, -1.77f, -1.18f)
                horizontalLineTo(1.91f)
                curveTo(1.12f, 1f, 0.44f, 1.45f, 0.14f, 2.18f)
                reflectiveCurveTo(-0.0f, 3.71f, 0.56f, 4.26f)
                lineToRelative(1.45f, 1.45f)
                verticalLineTo(22f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(4.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(1.06f, 2.56f)
                curveToRelative(0.15f, -0.35f, 0.46f, -0.56f, 0.84f, -0.56f)
                horizontalLineTo(22.09f)
                curveToRelative(0.38f, 0f, 0.69f, 0.21f, 0.84f, 0.56f)
                curveToRelative(0.15f, 0.35f, 0.07f, 0.72f, -0.2f, 0.99f)
                lineToRelative(-1.45f, 1.45f)
                horizontalLineTo(2.71f)
                lineToRelative(-1.45f, -1.45f)
                curveToRelative(-0.27f, -0.27f, -0.34f, -0.64f, -0.2f, -0.99f)
                close()
                moveTo(18f, 20.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(6f)
                horizontalLineTo(21f)
                verticalLineTo(22f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Archway = it}
