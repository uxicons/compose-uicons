package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsFromLine: ImageVector? = null

val Icons.Rc.ArrowsFromLine: ImageVector
    get() = _ArrowsFromLine ?: UXIcon(name = "ArrowsFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.4f, 6.0f)
                curveToRelative(0.49f, 0.25f, 1.09f, 0.06f, 1.35f, -0.43f)
                curveToRelative(0.39f, -0.75f, 0.84f, -1.31f, 1.26f, -1.71f)
                verticalLineToRelative(5.14f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1f, 1.0f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1.0f)
                verticalLineTo(3.87f)
                curveToRelative(0.42f, 0.4f, 0.87f, 0.95f, 1.26f, 1.7f)
                curveToRelative(0.18f, 0.34f, 0.69f, 0.73f, 1.35f, 0.43f)
                curveToRelative(0.5f, -0.23f, 0.68f, -0.86f, 0.43f, -1.35f)
                curveToRelative(-1.44f, -2.76f, -3.6f, -3.56f, -3.7f, -3.59f)
                curveToRelative(-0.22f, -0.08f, -0.45f, -0.08f, -0.67f, 0f)
                curveToRelative(-0.09f, 0.03f, -2.26f, 0.83f, -3.7f, 3.59f)
                curveToRelative(-0.25f, 0.49f, -0.06f, 1.09f, 0.43f, 1.35f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.61f, 18.0f)
                curveToRelative(-0.49f, -0.25f, -1.09f, -0.06f, -1.35f, 0.43f)
                curveToRelative(-0.39f, 0.75f, -0.84f, 1.31f, -1.26f, 1.71f)
                verticalLineToRelative(-5.14f)
                curveToRelative(0f, -0.55f, -0.45f, -1.0f, -1f, -1.0f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1.0f)
                verticalLineToRelative(5.14f)
                curveToRelative(-0.42f, -0.4f, -0.87f, -0.95f, -1.26f, -1.7f)
                curveToRelative(-0.18f, -0.34f, -0.69f, -0.73f, -1.35f, -0.43f)
                curveToRelative(-0.5f, 0.23f, -0.68f, 0.86f, -0.43f, 1.35f)
                curveToRelative(1.44f, 2.76f, 3.6f, 3.56f, 3.7f, 3.59f)
                curveToRelative(0.22f, 0.08f, 0.45f, 0.08f, 0.67f, 0f)
                curveToRelative(0.09f, -0.03f, 2.26f, -0.83f, 3.7f, -3.59f)
                curveToRelative(0.25f, -0.49f, 0.06f, -1.09f, -0.43f, -1.35f)
                close()
            }
        }.also { _ArrowsFromLine = it}
