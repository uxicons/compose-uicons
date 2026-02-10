package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AxeBattle: ImageVector? = null

val Icons.Rc.AxeBattle: ImageVector
    get() = _AxeBattle ?: UXIcon(name = "AxeBattle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 1f)
                curveToRelative(-0.8f, 0f, -1.28f, 0.58f, -1.75f, 1.14f)
                curveToRelative(-0.57f, 0.69f, -1.27f, 1.52f, -2.75f, 1.78f)
                verticalLineToRelative(-1.92f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.92f)
                curveToRelative(-1.48f, -0.26f, -2.17f, -1.09f, -2.75f, -1.78f)
                curveToRelative(-0.47f, -0.56f, -0.95f, -1.14f, -1.75f, -1.14f)
                curveToRelative(-2.65f, 0f, -5.5f, 3.06f, -5.5f, 8f)
                curveToRelative(0f, 5.01f, 2.8f, 8f, 5.5f, 8f)
                curveToRelative(0.8f, 0f, 1.28f, -0.58f, 1.75f, -1.14f)
                curveToRelative(0.57f, -0.69f, 1.27f, -1.52f, 2.75f, -1.78f)
                verticalLineToRelative(7.92f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7.92f)
                curveToRelative(1.48f, 0.26f, 2.17f, 1.09f, 2.75f, 1.78f)
                curveToRelative(0.47f, 0.56f, 0.95f, 1.14f, 1.75f, 1.14f)
                curveToRelative(2.7f, 0f, 5.5f, -2.99f, 5.5f, -8f)
                curveToRelative(0f, -4.94f, -2.85f, -8f, -5.5f, -8f)
                close()
                moveTo(6.71f, 14.58f)
                curveToRelative(-0.11f, 0.14f, -0.26f, 0.31f, -0.36f, 0.41f)
                curveToRelative(-1.45f, -0.13f, -3.35f, -2.21f, -3.35f, -5.99f)
                reflectiveCurveToRelative(1.9f, -5.86f, 3.35f, -5.99f)
                curveToRelative(0.1f, 0.1f, 0.24f, 0.27f, 0.36f, 0.41f)
                curveToRelative(0.71f, 0.86f, 1.85f, 2.22f, 4.29f, 2.52f)
                verticalLineToRelative(6.12f)
                curveToRelative(-2.43f, 0.3f, -3.57f, 1.67f, -4.29f, 2.52f)
                close()
                moveTo(17.65f, 14.99f)
                curveToRelative(-0.1f, -0.1f, -0.24f, -0.27f, -0.36f, -0.41f)
                curveToRelative(-0.71f, -0.86f, -1.85f, -2.22f, -4.29f, -2.52f)
                verticalLineToRelative(-6.12f)
                curveToRelative(2.43f, -0.3f, 3.57f, -1.67f, 4.29f, -2.52f)
                curveToRelative(0.11f, -0.14f, 0.26f, -0.31f, 0.36f, -0.41f)
                curveToRelative(1.45f, 0.13f, 3.35f, 2.21f, 3.35f, 5.99f)
                reflectiveCurveToRelative(-1.9f, 5.86f, -3.35f, 5.99f)
                close()
            }
        }.also { _AxeBattle = it}
