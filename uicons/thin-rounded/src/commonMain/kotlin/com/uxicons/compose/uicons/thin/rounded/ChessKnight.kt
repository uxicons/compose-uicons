package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChessKnight: ImageVector? = null

val Icons.Tr.ChessKnight: ImageVector
    get() = _ChessKnight ?: UXIcon(name = "ChessKnight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.5f, 23f)
                horizontalLineToRelative(-0.5f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.09f, -0.11f, -9.09f, -9.59f, -9.99f)
                curveToRelative(-1.07f, -0.1f, -2.07f, 0.54f, -2.49f, 1.58f)
                curveToRelative(-1.14f, 2.81f, -3.32f, 4.08f, -6.23f, 5.1f)
                curveToRelative(-1.01f, 0.35f, -1.68f, 1.3f, -1.68f, 2.36f)
                verticalLineToRelative(0.44f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.42f)
                curveToRelative(-1.15f, 7.14f, -6.73f, 10.53f, -7.55f, 11f)
                horizontalLineToRelative(-0.87f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(22.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(11.0f, 11.56f)
                curveToRelative(0.02f, -0.14f, -0.03f, -0.29f, -0.12f, -0.39f)
                reflectiveCurveToRelative(-0.23f, -0.17f, -0.38f, -0.17f)
                horizontalLineTo(4.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.44f)
                curveToRelative(0f, -0.63f, 0.41f, -1.2f, 1.01f, -1.42f)
                curveToRelative(2.75f, -0.97f, 5.47f, -2.32f, 6.83f, -5.67f)
                curveToRelative(0.26f, -0.63f, 0.87f, -1.02f, 1.47f, -0.96f)
                curveToRelative(8.57f, 0.81f, 8.69f, 8.66f, 8.69f, 8.99f)
                verticalLineToRelative(13f)
                horizontalLineTo(4.21f)
                curveToRelative(2.17f, -1.58f, 6.0f, -5.2f, 6.78f, -11.44f)
                close()
            }
        }.also { _ChessKnight = it}
