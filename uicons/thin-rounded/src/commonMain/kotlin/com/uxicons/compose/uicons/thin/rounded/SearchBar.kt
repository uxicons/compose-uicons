package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchBar: ImageVector? = null

val Icons.Tr.SearchBar: ImageVector
    get() = _SearchBar ?: UXIcon(name = "SearchBar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.5f, 4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(19.5f, 0f)
                horizontalLineToRelative(-15f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(22.47f, 15.06f)
                curveToRelative(0.47f, 0.41f, 0.65f, 1.02f, 0.46f, 1.62f)
                curveToRelative(-0.18f, 0.59f, -0.68f, 1.0f, -1.3f, 1.07f)
                lineToRelative(-1.93f, 0.2f)
                lineToRelative(1.91f, 3.87f)
                curveToRelative(0.38f, 0.71f, 0.06f, 1.66f, -0.66f, 2.01f)
                curveToRelative(-0.71f, 0.38f, -1.67f, 0.07f, -2.02f, -0.66f)
                lineToRelative(-1.94f, -3.91f)
                lineToRelative(-1.46f, 1.33f)
                curveToRelative(-0.45f, 0.41f, -1.08f, 0.52f, -1.63f, 0.27f)
                curveToRelative(-0.56f, -0.25f, -0.91f, -0.79f, -0.91f, -1.41f)
                verticalLineToRelative(-8.67f)
                curveToRelative(0f, -0.71f, 0.4f, -1.34f, 1.04f, -1.63f)
                curveToRelative(0.64f, -0.29f, 1.36f, -0.19f, 1.9f, 0.28f)
                lineToRelative(6.53f, 5.63f)
                close()
                moveTo(21.81f, 15.82f)
                lineTo(15.29f, 10.2f)
                curveToRelative(-0.24f, -0.21f, -0.55f, -0.25f, -0.83f, -0.12f)
                curveToRelative(-0.29f, 0.13f, -0.46f, 0.4f, -0.46f, 0.72f)
                verticalLineToRelative(8.67f)
                curveToRelative(0f, 0.22f, 0.12f, 0.4f, 0.31f, 0.49f)
                curveToRelative(0.19f, 0.08f, 0.4f, 0.05f, 0.56f, -0.1f)
                lineToRelative(1.95f, -1.78f)
                curveToRelative(0.23f, -0.22f, 0.65f, -0.14f, 0.79f, 0.15f)
                lineToRelative(2.23f, 4.5f)
                curveToRelative(0.11f, 0.24f, 0.43f, 0.34f, 0.67f, 0.21f)
                curveToRelative(0.24f, -0.12f, 0.35f, -0.43f, 0.22f, -0.67f)
                lineToRelative(-2.23f, -4.52f)
                curveToRelative(-0.16f, -0.3f, 0.06f, -0.69f, 0.4f, -0.72f)
                lineToRelative(2.64f, -0.28f)
                curveToRelative(0.32f, -0.03f, 0.43f, -0.29f, 0.45f, -0.37f)
                curveToRelative(0.03f, -0.08f, 0.09f, -0.35f, -0.16f, -0.56f)
                close()
            }
        }.also { _SearchBar = it}
