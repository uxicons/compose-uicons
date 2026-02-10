package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLock: ImageVector? = null

val Icons.Tr.UserLock: ImageVector
    get() = _UserLock ?: UXIcon(name = "UserLock") {
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
                moveTo(22f, 15.34f)
                verticalLineToRelative(-1.84f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.84f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(4f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.39f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(16f, 13.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(1.54f)
                curveToRelative(-0.16f, -0.02f, -0.33f, -0.04f, -0.5f, -0.04f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.01f, -0.5f, 0.04f)
                verticalLineToRelative(-1.54f)
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
        }.also { _UserLock = it}
