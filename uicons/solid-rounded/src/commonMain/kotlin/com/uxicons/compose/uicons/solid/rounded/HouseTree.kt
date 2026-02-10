package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTree: ImageVector? = null

val Icons.Sr.HouseTree: ImageVector
    get() = _HouseTree ?: UXIcon(name = "HouseTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.08f, 11.41f)
                lineToRelative(-3f, -2.35f)
                curveToRelative(-1.81f, -1.42f, -4.35f, -1.42f, -6.16f, 0f)
                lineToRelative(-3f, 2.35f)
                curveToRelative(-1.22f, 0.95f, -1.92f, 2.39f, -1.92f, 3.94f)
                verticalLineToRelative(4.15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-4.15f)
                curveToRelative(0f, -1.55f, -0.7f, -2.98f, -1.92f, -3.94f)
                close()
                moveTo(10f, 18f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                close()
                moveTo(23.6f, 22.25f)
                curveToRelative(-0.58f, 1.08f, -1.7f, 1.75f, -2.92f, 1.75f)
                horizontalLineToRelative(-4.51f)
                curveToRelative(1.12f, -1.17f, 1.82f, -2.75f, 1.82f, -4.5f)
                verticalLineToRelative(-4.15f)
                curveToRelative(0f, -2.17f, -0.98f, -4.17f, -2.69f, -5.51f)
                lineToRelative(-3.0f, -2.35f)
                curveToRelative(-1.01f, -0.79f, -2.19f, -1.25f, -3.4f, -1.41f)
                curveToRelative(0.06f, -0.17f, 0.13f, -0.33f, 0.23f, -0.48f)
                curveToRelative(0.02f, -0.04f, 4.13f, -4.83f, 4.13f, -4.83f)
                curveToRelative(0.99f, -1.01f, 2.51f, -0.96f, 3.4f, -0.05f)
                curveToRelative(0f, 0f, 4.16f, 4.85f, 4.18f, 4.89f)
                curveToRelative(0.44f, 0.68f, 0.48f, 1.55f, 0.08f, 2.26f)
                curveToRelative(-0.33f, 0.58f, -0.98f, 0.9f, -0.98f, 0.9f)
                lineToRelative(2.67f, 3.9f)
                curveToRelative(0.4f, 0.6f, 0.44f, 1.47f, 0.06f, 2.19f)
                curveToRelative(-0.36f, 0.69f, -1.09f, 1.05f, -1.09f, 1.05f)
                lineToRelative(1.88f, 3.02f)
                curveToRelative(0.65f, 1.01f, 0.7f, 2.29f, 0.13f, 3.35f)
                close()
            }
        }.also { _HouseTree = it}
