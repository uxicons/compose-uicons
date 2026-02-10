package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SearchAlt: ImageVector? = null

val Icons.Sc.SearchAlt: ImageVector
    get() = _SearchAlt ?: UXIcon(name = "SearchAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.77f, 17.75f)
                verticalLineToRelative(-0.11f)
                curveToRelative(0.07f, -3.86f, 2.61f, -6.37f, 6.47f, -6.4f)
                curveToRelative(2.1f, 0.01f, 3.81f, 0.75f, 4.95f, 2.04f)
                curveToRelative(0.02f, -0.49f, 0.03f, -1.0f, 0.03f, -1.52f)
                curveToRelative(0f, -5.04f, -0.96f, -8.74f, -1.0f, -8.9f)
                curveToRelative(-0.09f, -0.33f, -0.33f, -0.59f, -0.65f, -0.69f)
                curveToRelative(-0.15f, -0.05f, -3.63f, -1.17f, -7.75f, -1.17f)
                reflectiveCurveToRelative(-7.61f, 1.12f, -7.75f, 1.17f)
                curveToRelative(-0.32f, 0.1f, -0.56f, 0.37f, -0.65f, 0.7f)
                curveToRelative(-0.04f, 0.16f, -1.0f, 3.9f, -1.0f, 8.9f)
                curveToRelative(0f, 5.04f, 0.96f, 8.74f, 1.0f, 8.9f)
                curveToRelative(0.09f, 0.33f, 0.33f, 0.59f, 0.65f, 0.69f)
                curveToRelative(0.15f, 0.05f, 3.56f, 1.15f, 7.63f, 1.17f)
                curveToRelative(-1.2f, -1.11f, -1.88f, -2.74f, -1.92f, -4.77f)
                close()
                moveTo(8.24f, 7.59f)
                curveToRelative(0f, -0.56f, 0.46f, -1.02f, 1.02f, -1.02f)
                horizontalLineToRelative(4.49f)
                curveToRelative(0.56f, 0f, 1.02f, 0.46f, 1.02f, 1.02f)
                reflectiveCurveToRelative(-0.46f, 1.02f, -1.02f, 1.02f)
                horizontalLineToRelative(-4.49f)
                curveToRelative(-0.56f, 0f, -1.02f, -0.46f, -1.02f, -1.02f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.29f, 21.25f)
                lineToRelative(-1.11f, -1.1f)
                curveToRelative(0.36f, -0.67f, 0.56f, -1.49f, 0.57f, -2.47f)
                curveToRelative(-0.05f, -2.8f, -1.69f, -4.42f, -4.5f, -4.43f)
                curveToRelative(-2.8f, 0.02f, -4.43f, 1.63f, -4.49f, 4.43f)
                curveToRelative(0f, 0f, -0.34f, 4.47f, 4.5f, 4.47f)
                curveToRelative(0.97f, 0f, 1.8f, -0.19f, 2.47f, -0.55f)
                lineToRelative(1.12f, 1.11f)
                curveToRelative(0.63f, 0.56f, 1.25f, 0.19f, 1.45f, -0.01f)
                curveToRelative(0.4f, -0.4f, 0.39f, -1.05f, -0.01f, -1.44f)
                close()
            }
        }.also { _SearchAlt = it}
