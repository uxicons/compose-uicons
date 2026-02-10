package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tombstone: ImageVector? = null

val Icons.Tc.Tombstone: ImageVector
    get() = _Tombstone ?: UXIcon(name = "Tombstone") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.0f, 9.78f)
                curveToRelative(-0.04f, 0.28f, -0.29f, 0.47f, -0.56f, 0.43f)
                curveToRelative(-0.97f, -0.13f, -1.95f, -0.19f, -2.93f, -0.21f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5.5f)
                curveToRelative(-0.98f, 0.02f, -1.96f, 0.08f, -2.93f, 0.21f)
                curveToRelative(-0.28f, 0.03f, -0.53f, -0.16f, -0.56f, -0.43f)
                curveToRelative(-0.04f, -0.27f, 0.16f, -0.53f, 0.43f, -0.56f)
                curveToRelative(1.01f, -0.14f, 2.04f, -0.2f, 3.07f, -0.22f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(1.03f, 0.02f, 2.05f, 0.08f, 3.07f, 0.22f)
                curveToRelative(0.27f, 0.04f, 0.47f, 0.29f, 0.43f, 0.56f)
                close()
                moveTo(22.99f, 22.59f)
                curveToRelative(-0.05f, 0.27f, -0.32f, 0.45f, -0.58f, 0.4f)
                curveToRelative(-0.05f, -0.01f, -5.33f, -0.99f, -10.41f, -0.99f)
                reflectiveCurveToRelative(-10.36f, 0.98f, -10.41f, 0.99f)
                curveToRelative(-0.27f, 0.05f, -0.53f, -0.13f, -0.58f, -0.4f)
                curveToRelative(-0.05f, -0.27f, 0.13f, -0.53f, 0.4f, -0.58f)
                curveToRelative(0.02f, -0.0f, 0.62f, -0.12f, 1.59f, -0.26f)
                verticalLineToRelative(-11.75f)
                curveToRelative(-0.0f, -6.31f, 2.69f, -9f, 9.0f, -9f)
                reflectiveCurveToRelative(9f, 2.69f, 9f, 9f)
                verticalLineToRelative(11.75f)
                curveToRelative(0.97f, 0.15f, 1.57f, 0.26f, 1.59f, 0.26f)
                curveToRelative(0.27f, 0.05f, 0.45f, 0.31f, 0.4f, 0.58f)
                close()
                moveTo(20.0f, 10f)
                curveToRelative(0f, -5.83f, -2.17f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8.0f, 2.17f, -8.0f, 8f)
                verticalLineToRelative(11.6f)
                curveToRelative(2.05f, -0.28f, 5.06f, -0.6f, 8f, -0.6f)
                reflectiveCurveToRelative(5.95f, 0.32f, 8f, 0.6f)
                verticalLineToRelative(-11.6f)
                close()
            }
        }.also { _Tombstone = it}
