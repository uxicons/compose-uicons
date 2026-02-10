package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AddFolder: ImageVector? = null

val Icons.Tr.AddFolder: ImageVector
    get() = _AddFolder ?: UXIcon(name = "AddFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 15f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(3.56f)
                curveToRelative(0.39f, 0f, 0.77f, 0.09f, 1.12f, 0.26f)
                lineToRelative(3.15f, 1.58f)
                curveToRelative(0.21f, 0.1f, 0.44f, 0.16f, 0.67f, 0.16f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(1f, 4.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(21.95f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-0.39f, 0f, -0.77f, -0.09f, -1.12f, -0.26f)
                lineToRelative(-3.15f, -1.58f)
                curveToRelative(-0.21f, -0.1f, -0.44f, -0.16f, -0.67f, -0.16f)
                horizontalLineToRelative(-3.56f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(23f, 18.5f)
                verticalLineToRelative(-10.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _AddFolder = it}
