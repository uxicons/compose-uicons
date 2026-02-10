package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sword: ImageVector? = null

val Icons.Tr.Sword: ImageVector
    get() = _Sword ?: UXIcon(name = "Sword") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.56f, 0.44f)
                curveToRelative(-0.36f, -0.36f, -0.88f, -0.52f, -1.43f, -0.39f)
                curveToRelative(-2.35f, 0.77f, -4.53f, 2.11f, -6.28f, 3.86f)
                lineTo(6.11f, 13.65f)
                curveToRelative(-2.27f, -1.3f, -4.41f, -1.63f, -4.54f, -1.65f)
                curveToRelative(-0.27f, -0.04f, -0.53f, 0.15f, -0.56f, 0.42f)
                reflectiveCurveToRelative(0.15f, 0.53f, 0.42f, 0.57f)
                curveToRelative(0.04f, 0.01f, 3.43f, 0.53f, 6.02f, 2.85f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-1.65f, -1.65f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(4f, 4f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-1.65f, -1.65f)
                lineToRelative(4.95f, -4.95f)
                curveToRelative(2.33f, 2.59f, 2.85f, 5.98f, 2.85f, 6.02f)
                curveToRelative(0.04f, 0.25f, 0.25f, 0.43f, 0.49f, 0.43f)
                curveToRelative(0.02f, 0f, 0.05f, -0.0f, 0.07f, -0.01f)
                curveToRelative(0.27f, -0.04f, 0.46f, -0.29f, 0.42f, -0.56f)
                curveToRelative(-0.02f, -0.12f, -0.34f, -2.27f, -1.65f, -4.54f)
                lineToRelative(9.74f, -9.74f)
                curveToRelative(1.75f, -1.75f, 3.09f, -3.92f, 3.87f, -6.33f)
                curveToRelative(0.11f, -0.5f, -0.04f, -1.02f, -0.4f, -1.38f)
                close()
                moveTo(19.38f, 7.45f)
                lineToRelative(-9.58f, 9.58f)
                curveToRelative(-0.37f, -0.53f, -0.79f, -1.06f, -1.28f, -1.55f)
                curveToRelative(-0.49f, -0.49f, -1.02f, -0.91f, -1.55f, -1.28f)
                lineToRelative(9.58f, -9.58f)
                curveToRelative(1.64f, -1.64f, 3.68f, -2.89f, 5.84f, -3.6f)
                curveToRelative(0.18f, -0.04f, 0.34f, 0.01f, 0.46f, 0.14f)
                curveToRelative(0.12f, 0.12f, 0.17f, 0.29f, 0.15f, 0.41f)
                curveToRelative(-0.72f, 2.21f, -1.98f, 4.24f, -3.62f, 5.89f)
                close()
            }
        }.also { _Sword = it}
