package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserUnlock: ImageVector? = null

val Icons.Tr.UserUnlock: ImageVector
    get() = _UserUnlock ?: UXIcon(name = "UserUnlock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveTo(4.69f, 0f, 2f, 2.69f, 2f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(11.31f, 0f, 8f, 0f)
                close()
                moveTo(8f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(5.24f, 1f, 8f, 1f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(11.94f, 15.6f)
                curveToRelative(-0.13f, 0.24f, -0.43f, 0.34f, -0.68f, 0.21f)
                curveToRelative(-1f, -0.53f, -2.13f, -0.81f, -3.27f, -0.81f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                curveToRelative(1.3f, 0f, 2.59f, 0.32f, 3.73f, 0.92f)
                curveToRelative(0.24f, 0.13f, 0.34f, 0.43f, 0.21f, 0.68f)
                close()
                moveTo(20.5f, 15f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.01f, -0.5f, 0.04f)
                verticalLineToRelative(-1.54f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                curveToRelative(1.06f, 0f, 2.0f, 0.67f, 2.36f, 1.67f)
                curveToRelative(0.09f, 0.26f, 0.38f, 0.4f, 0.64f, 0.3f)
                curveToRelative(0.26f, -0.09f, 0.4f, -0.38f, 0.3f, -0.64f)
                curveToRelative(-0.49f, -1.4f, -1.82f, -2.33f, -3.3f, -2.33f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.84f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(23f, 20.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2f)
                close()
                moveTo(19.5f, 19.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _UserUnlock = it}
