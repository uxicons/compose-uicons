package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WhiteSpace: ImageVector? = null

val Icons.Rr.WhiteSpace: ImageVector
    get() = _WhiteSpace ?: UXIcon(name = "WhiteSpace") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 1f)
                verticalLineTo(23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(12.01f)
                curveToRelative(-0.01f, 0.5f, -0.2f, 1f, -0.58f, 1.38f)
                lineToRelative(-3.2f, 3.3f)
                curveToRelative(-0.2f, 0.2f, -0.46f, 0.3f, -0.72f, 0.3f)
                curveToRelative(-0.25f, 0f, -0.5f, -0.09f, -0.69f, -0.28f)
                curveToRelative(-0.4f, -0.38f, -0.41f, -1.02f, -0.02f, -1.41f)
                lineToRelative(2.23f, -2.31f)
                horizontalLineTo(5.0f)
                lineToRelative(2.22f, 2.31f)
                curveToRelative(0.39f, 0.4f, 0.38f, 1.03f, -0.02f, 1.41f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.28f, -0.69f, 0.28f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.1f, -0.72f, -0.3f)
                lineToRelative(-3.21f, -3.31f)
                curveToRelative(-0.38f, -0.37f, -0.56f, -0.87f, -0.57f, -1.37f)
                verticalLineToRelative(10.98f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(1f)
                curveTo(0f, 0.45f, 0.45f, 0f, 1f, 0f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(11.94f)
                curveToRelative(0.01f, -0.5f, 0.2f, -1.0f, 0.58f, -1.38f)
                lineToRelative(3.2f, -3.27f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.41f, -0.01f)
                curveToRelative(0.4f, 0.39f, 0.4f, 1.02f, 0.01f, 1.41f)
                lineToRelative(-2.26f, 2.3f)
                horizontalLineToRelative(14.07f)
                lineToRelative(-2.24f, -2.3f)
                curveToRelative(-0.39f, -0.4f, -0.38f, -1.03f, 0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.38f, 1.41f, 0.01f)
                lineToRelative(3.21f, 3.27f)
                curveToRelative(0.38f, 0.38f, 0.57f, 0.88f, 0.58f, 1.38f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _WhiteSpace = it}
